package ejerciciodeclase;

public class EjercioDeClase {

    public int problema1(long a) {
        int digitoMenor = 9;
        while (a > 0) {
            int c = (int) (a % 10);
            if (c < digitoMenor) {
                digitoMenor = c;
            }
            a = a / 10;
        }
        return digitoMenor;
    }

    public long problema2(long a) {
        int digitoMayor = 0;
        while (a > 0) {
            int b = (int) (a % 10);
            if (b > digitoMayor) {
                digitoMayor = b;
            }
            a = a / 10;
        }
        return digitoMayor;
    }

    public int problema3(long a, int b) {
        int contador = 0;
        while (a > 0) {
            int c = (int) (a % 10);
            if (c == b) {
                contador++;
            }
            a = a / 10;
        }
        return contador;
    }

    public long problema4(long a) {
        long b = 0, c = a, nuevoNumero = 0,d=0;
        int contador = 0;
        while (c > 0) {
            contador++;
            c = c / 10;
        }
        for(int i=3;i>=1;i--){
            b=a%10;
            d=(long) (b*Math.pow(10, contador-i));
            nuevoNumero+=d;
            a=a/10;
        }
        return nuevoNumero+a;
    }

    public int problema5(int a[]) {
        int mayor = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > mayor) {
                mayor = a[i];
            }
        }
        return mayor;
    }

    public int problema6(int a[]) {
        int suma = 0;
        for (int i = 1; i < a.length; i++) {
            suma += a[i];
            i++;
        }
        return suma;
    }

    public int problema7(String a) {
        String[] contador = a.trim().split(" ");
        return contador.length;
    }
    public String problema8(boolean a []){
        for(int i=0;i<a.length;i++){
            if(a[i]==true){
                System.out.print((i+1)+",");
            }
        }
        return ".";
    }
}

    

