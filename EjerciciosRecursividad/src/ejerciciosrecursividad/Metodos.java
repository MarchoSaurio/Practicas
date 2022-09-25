package ejerciciosrecursividad;

public class Metodos {

    public int mayori(int a) {
        int mayor = 0;
        while (a > 0) {
            int b = a % 10;
            if (b > mayor) {
                mayor = b;
            }
            a = a / 10;
        }
        return mayor;
    }

    public int mayor(int a) {
        if (a < 10) {
            return a;
        }
        return Math.max(a % 10, mayor(a / 10));
    }

    public int[] arregloDiferenciasAbsolutasi(int[] a) {
        int[] diferenciasAbsolutas = new int[a.length - 1];
        for (int i = 0; i < a.length - 1; i++) {
            int b = Math.abs(a[i] - a[i + 1]);
            diferenciasAbsolutas[i] = b;
        }
        return diferenciasAbsolutas;
    }

    public int[] arregloDiferenciaAbsoluta(int[] a) {
        if (a.length < 2) {
            return new int[0];
        }
        int diferencia = Math.abs(a[0] - a[1]);
        int[] b = new int[a.length - 1];    //Debido a que los arreglos no sondinamicos se necesita la ayuda de un for 
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i + 1];
        }
        int[] c = arregloDiferenciaAbsoluta(b);
        int[] respuesta = new int[c.length + 1];
        respuesta[0] = diferencia;
        for (int i = 0; i < c.length; i++) {
            respuesta[i + 1] = c[i];
        }
        return respuesta;
    }

    public long diferenciaAbsolutai(long a, int b) {
        long diferencia = 0;
        long c = 1;
        while (a > 0) {
            long d = a % 10;
            diferencia += Math.abs((d - b) * c);
            c = c * 10;
            a = a / 10;
        }
        return diferencia;
    }

    public long diferenciaAbsoluta(long a, long b) {
        if (a < 10) {
            return Math.abs(a - b);
        }
        return Math.abs(a % 10 - b) + diferenciaAbsoluta(a / 10, b) * 10;
    }

    public int posicionDigitoi(long a, int b) {
        int c = -1;
        String d = String.valueOf(a);
        for (int i = 0; i < d.length(); i++) {
            if (d.charAt(i) == b + '0') {
                c = (d.length() - 1) - i;
            }
        }
        return c;
    }

    public int posicionDigito(long a, long b) {
        if (a == 0) {
            return -1;
        }
        if (a % 10 == b) {
            return 0;
        }
        if (a % 10 != b) {
             long x =posicionDigito(a / 10, b);
            return (int) (x==-1?-1:1 + x);
        }
        return posicionDigito(a / 10, b);
    }
    public int posicionDigitoEspecial(long a, long b){
        if(a==0 && b==0){
            return 0;
        }
        return posicionDigito(a,b);
    }

    public boolean partePrimeroi(long a, long b) {
        String aS = String.valueOf(a);
        String bS = String.valueOf(b);
        return aS.contains(bS) ? true : false;
    }

    public boolean checar(long a, long b) {
        String bS = String.valueOf(b);
        if (a % (Math.pow(10, bS.length())) == b) {
            return true;
        }
        return false;
    }

    public boolean partePrimeroRecursivo(long a, long b) {
        String aS = String.valueOf(a);
        String bS = String.valueOf(b);
        if (aS.length() < bS.length() || a == 0) {
            return false;
        }
        if (checar(a, b)) {
            return true;
        }
        return partePrimeroRecursivo(a / 10, b);
    }

    public boolean partePrimero(long a, long b) {
        if (a == 0 && b == 0) {
            return true;
        }
        return partePrimeroRecursivo(a, b);
    }

    public long digitosIntercambiadosi(long a) {
        long d = 1, c = 10, resultado = 0;
        while (a > 0) {
            resultado = (a % 100 * d) + (a % 10 * c);
            d *= 100;
            c *= 100;
            a = a / 100;
        }
        return resultado;
    }

    public long digitosIntercambiados(long a) {
        if (a < 10) {
            return a * 10;
        }
        long g = (a % 10) * 10 + (a / 10) % 10;
        return digitosIntercambiados(a / 100) * 100 + g;
    }

    public long vecesRepetidasi(long a, int b) {
        long d = 1, resultado = 0;
        while (a > 0) {
            long c = a % 10;
            if (c == b) {
                resultado += c * d;
                d = d * 10;
            }
            a = a / 10;
        }
        return resultado;
    }

    public long vecesRepetidas(long a, long b) {
        if (a == 0) {
            return a;
        }
        if (a % 10 == b) {
            return b + vecesRepetidas(a / 10, b) * 10;
        }
        return vecesRepetidas(a / 10, b);
    }

}
