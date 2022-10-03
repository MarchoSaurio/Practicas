package practica3;

import javafx.util.Pair;

public class metodos3 {

    /*
   a) Elaborar método que reciba un entero y retorne el entero sin los dígitos 3,5 y 7. Por
ejemplo si se pasa 732947 retornará 294, si se pasa 5834675291 retornará 846291, si se
pasa 573537 retornará 0.
     */
    static long quita357I(long n) {
        long r = 0;
        long d = 1;
        while (n > 0) {
            long x = n % 10;
            if (x != 3 && x != 5 && x != 7) {
                r = r + x * d;
                d = d * 10;
            }
            n = n / 10;
        }
        return r;
    }

    static long quita357(long n) {
        long r = n % 10;
        if (n < 10) {
            return n != 3 && n != 5 && n != 7 ? n : 0;
        }
        if (r != 3 && r != 5 && r != 7) {
            return r + quita357(n / 10) * 10;
        }
        return quita357(n / 10);
    }

    /*
   b) Elaborar método que reciba dos enteros y retorne la combinación de los dígitos de
ambos, por ejemplo, si se pasa 8293 y 362 retornará 8239632, si se pasa 2893 y 32102
retornará 322398102
     */
    public long combinacioni(long a, long b) {
        long resultado = 0;
        long c = 1;
        long d = 10;
        long h = Math.max(a, b);
        long j = 100;
        while (h > 0) {
            if (b == 0) {
                d = d / 10;
            }
            if (a == 0) {
                d = 0;
                j = 10;
            }
            resultado += (b % 10) * c + (a % 10) * d;
            d = d * j;
            c = c * j;
            a = a / 10;
            b = b / 10;
            h = h / 10;
        }
        return resultado;
    }

    public long combinacion(long a, long b) {
        if (b == 0) {
            return a;
        }
        if (a == 0) {
            return b;
        }
        if (a < 10) {
            return a * 10;
        }
        if (b < 10) {
            return b;
        }
        return combinacion(a % 10, b % 10) + combinacion(a / 10, b / 10);
    }

    /*
   Elaborar método que reciba un entero y separe en dígitos el entero para dar un entero
como salida, por ejemplo, si se pasa 8329238 retornará 8393 y228, es el proceso inverso
del inciso b.
     */
    public String separaCombinacioni(long a) {
        long b = 0, c = 0;
        int f = 1;
        while (a > 0) {
            b += a % 10 * f;
            a /= 10;
            c += a % 10 * f;
            a /= 10;
            f = f * 10;
        }
        return b + " " + c;
    }

    public long [] separaCombinacion(long a) {
       long c [] = new long [2];
        if (a < 10) {
            c[0]=a;
            c[1]=0;
            return c;
        }
        if (a > 10 && a < 100) {
            c[0]=a/10;
            c[1]=a%10;
            return c;
        }
        long [] d = separaCombinacion(a/100);
        c[0]=d[0]*10+(a/10)%10;
        c[1]=d[1]*10+a%10;
        return c;
    }

    public long separaCombinacion2(long a) {
        if (a < 10) {
            return 0;
        }
        if (a > 10 && a < 100) {
            return a / 10;
        }
        return separaCombinacion2(a % 100) + separaCombinacion2(a / 100) * 10;

    }


    /* - Elaborar método que ingrese una cadena de caracteres y retorne la cadena sin las
vocales, por ejemplo, si se pasa “hola mundo” retornará “hl mnd”.
     */
    public String quitarVocalesi(String a) {
        String b = "";
        char c;
        for (int i = 0; i < a.length(); i++) {
            c = a.charAt(i);
            if (a.charAt(i) != 'a' && a.charAt(i) != 'e' && a.charAt(i) != 'i' && a.charAt(i) != 'o' && a.charAt(i) != 'u') {
                b += c;
            }
        }
        return b;
    }

    public String quitarVocales(String a) {
        if (a.length() <= 1) {
            return a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u") ? "" : a;
        }
        return quitarVocales(a.substring(0, 1)) + quitarVocales(a.substring(1, a.length()));
    }

    /* Elaborar método que ingrese un arreglo de enteros y retorne la sumatoria de estos. Por
ejemplo si se pasa {50,81,32} retornará 163.
.
     */
    public long sumaArregloi(int[] a) {
        long b = 0;
        for (int i = 0; i < a.length; i++) {
            b += a[i];
        }
        return b;
    }

    public long sumaArreglo(int[] a) {
        if (a.length == 1) {
            return a[0];
        }
        if (a.length > 1) {
            return a[0] + sumaArreglo(subArreglo(a, 1, a.length - 1));
        }
        return 0;
    }


    /*
    Elaborar método que ingrese un arreglo de enteros y un entero y retorne un arreglo con
los enteros que son múltiplos del entero que es pasado junto con el arreglo. Por ejemplo, si
se pasa {7,19,49,51,35,77,90} y 7 y retornará {7,49,35,77}.
     */
    public int[] multiplosi(int[] a, int b) {
        int[] c = new int[2];
        for (int i = 0; i < a.length; i++) {
            if (a[i] % b == 0) {
                c[i] = a[i];
            }
        }
        return c;
    }

    public int[] concatenar(int a[], int b[]) {
        int[] c = new int[a.length + b.length];
        int indice = 0;
        for (int i = 0; i < a.length; i++) {
            c[indice] = a[i];
            indice++;
        }
        for (int i = 0; i < b.length; i++) {
            c[indice] = b[i];
            indice++;
        }
        return c;
    }

    public int[] subArreglo(int[] a, int l, int r) {
        if (r < l) {
            return new int[0];
        }
        int c[] = new int[r - l + 1];
        for (int i = 0; i < c.length; i++) {
            c[i] = a[l + i];
        }
        return c;
    }

    public int[] multiplos(int a[], int b) {
        if (b == 0) {
            return new int[0];
        }
        if (a.length == 0) {
            return a;
        }
        if (a[0] % b != 0) {
            return multiplos(subArreglo(a, 1, a.length - 1), b);
        }
        if (a[0] % b == 0) {
            int s[] = new int[1];
            s[0] = a[0];
            return concatenar(s, multiplos(subArreglo(a, 1, a.length - 1), b));
        }
        return a;
    }

    /*
    Elaborar método que ingrese dos arreglos de enteros retornando un arreglo donde se
mezclen los datos del primero con el del segundo. Por ejemplo si se pasa {32,43,12} y
{90,49,54,23} retornará {32,90,43,49,12,54,23}.
     */
    public int[] mezclaArraglosi(int a[], int b[]) {
        int[] c = new int[a.length + b.length];
        int indice = 0;
        for (int i = 0; i < a.length; i++) {
            c[indice] = a[i];
            indice += 2;
        }
        indice = 1;
        for (int i = 0; i < b.length; i++) {
            c[indice] = b[i];
            indice += 2;
        }
        return c;
    }

    public int[] mezclaArreglos(int a[], int[] b) {
        if (a.length == 0 && b.length > 0) {
            return b;
        }
        if (b.length == 0 && a.length > 0) {
            return a;
        }
        if (a.length == 0 && b.length == 0) {
            return new int[0];
        }
        int s[] = new int[1];
        s[0] = a[0];
        int[] z = new int[1];
        z[0] = b[0];
        return concatenar(concatenar(s, z), mezclaArreglos(subArreglo(a, 1, a.length - 1), subArreglo(b, 1, b.length - 1)));
    }

    /*
    Elaborar método similar al g, donde la mezcla se hace ajustando siempre al valor menor
primero entre los pares que se mezclan. Por ejemplo: si se pasa {89,32,43,23} y
{32,90,43,21} retornará {32,89,32,90,43,43,21,23}.
     */
    public int[] mezaclaArreglosOrdeni(int a[], int[] b) {
        int[] c = new int[a.length + b.length];
        int indice = 0;
        for (int i = 0; i < Math.min(a.length, b.length); i++) {
            if (a[i] < b[i]) {
                c[indice] = a[i];
                indice++;
                c[indice] = b[i];
                indice++;
            } else {
                c[indice] = b[i];
                indice++;
                c[indice] = a[i];
                indice++;
            }
        }
        /* for(int i=Math.min(a.length, b.length);i<a.length;i++){
            c[indice]=a[i];
            indice++;
        }
        for(int i=Math.min(a.length, b.length);i<b.length;i++){
            c[indice]=b[i];
            indice++; 
        }*/
        return c;
    }

    public int[] mezclaArreglosOrden(int[] a, int[] b) {
        if (a.length == 0 && b.length == 0) {
            return new int[0];
        }
        int c[] = new int[1];
        c[0] = Math.min(a[0], b[0]);
        int d[] = new int[1];
        d[0] = Math.max(a[0], b[0]);
        return concatenar(concatenar(c, d), mezclaArreglosOrden(subArreglo(a, 1, a.length - 1), subArreglo(b, 1, b.length - 1)));
    }
}
