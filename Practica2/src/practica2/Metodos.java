package practica2;

import java.util.ArrayList;

public class Metodos {

    public int digitosPares(int a) {
        int contador = 0, b = 0;
        b = a;
        while (a > 0) {
            if ((a % 10) % 2 == 0) {
                contador++;
            }
            a = a / 10;
        }
        return contador;
    }

    public boolean esPalindromo(String a) {
        a = a.toLowerCase();
        for (int i = 0, j = a.length() - 1; i <= j; i++, j--) {
            if (a.charAt(i) != a.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public boolean esCapicua(int a) {
        String b = String.valueOf(a);
        for (int i = 0, j = b.length() - 1; i <= j; i++, j--) {
            if (b.charAt(i) != b.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public int cantidadRepetida(float a[], float b) {
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                contador++;
            }
        }
        return contador;
    }

    public int[] coleccion(int a[]) {
        int[] contador = new int[6];
        contador[0] = 0;
        for (int i = 0; i < a.length; i++) {
            contador[a[i]]++;
        }
        if (contador[1] % 2 == 1 || contador[2] % 2 == 1 || contador[3] % 2 == 1 || contador[4] % 2 == 1 || contador[5] % 2 == 1) {
            System.out.println("El arreglo es impar");
            return new int[0];
        }
        int indice = 0;
        while (contador[1] > 0 || contador[2] > 0 || contador[3] > 0 || contador[4] > 0 || contador[5] > 0) {
            for (int i = 1; i <= 5; i++) {
                if (contador[i] > 0) {
                    a[indice] = i;
                    indice++;
                    a[indice] = i;
                    indice++;
                    contador[i] -= 2;
                }
            }
        }
        return a;
    }

    public ArrayList<Integer> GetColores(Imagen a) {
        ArrayList<Integer> colores = new ArrayList<Integer>();
        int[] pixeles = a.getPixeles();
        boolean nuevoColor;
        for (int i = 0; i < pixeles.length; i++) {
            nuevoColor = true;
            for (int j = 0; j < colores.size(); j++) {
                if (colores.get(j) == pixeles[i]) {
                    nuevoColor = false;
                    break;
                }
            }
            if (nuevoColor == true) {
                colores.add(pixeles[i]);
            }
        }
        return colores;
    }
}
