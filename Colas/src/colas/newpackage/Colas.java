package colas.newpackage;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Colas {

    public static void main(String[] args) throws ExcepcionDeColaLlena, ExcepcionDeColaVacia {
        Scanner sc = new Scanner(System.in);
        int opcion = 0, elemento = 0, busqueda = 0;
        ColaDinamica<Integer> c = new ColaDinamica<>(2);
        do {
            /*opcion = Integer.parseInt(JOptionPane.showInputDialog("1.-Anadir elemento: \n"
                    + "2.-Eliminar elemento de la cola: \n"
                    + "3.-Tamano de la cola: \n"
                    + "4.-Primer elemento de la cola: \n"
                    + "5.-Ultimo elemento de la cola: \n")
                    + "6.-Limpiar la cola."
                    + "7.-Elemento a buscar dentro de la cola: "
                    + "8.-Salir");*/
            System.out.println(
"                     1.-Anadir elemento: \n" +
"                     2.-Eliminar elemento de la cola: \n" +
"                     3.-Tamano de la cola: \n" +
"                     4.-Primer elemento de la cola: \n" +
"                     5.-Ultimo elemento de la cola: \n" +
"                     6.-Limpiar la cola \n" +
"                     7.-Elemento a buscar dentro de la cola: \n" +
"                     8.-Salir");
            opcion=sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el elento a insertar ");
                    elemento = sc.nextInt();
                    c.add(elemento);
                    System.out.println("Se agrego con exito!! \n");
                    break;
                case 2:
                    System.out.println("Se elimino el primero elemento de la cola");
                    c.remove();
                    break;
                case 3:
                    System.out.println("El tamano de la cola es: " + c.size());
                    break;
                case 4:
                    System.out.println("El primer elemento es: " + c.first());
                    break;
                case 5:
                    System.out.println("Ultimo elemento de la cola: " + c.last());
                    break;
                case 6:
                    System.out.println("Se vacio la cola con exito!!");
                    c.clear();
                    break;
                case 7:
                    System.out.println("Elemto a encontrar: ");
                    busqueda = sc.nextInt();
                    System.out.println("Posicion de elemento: " + c.search(busqueda));
                    break;
                case 8:
                    System.out.println("adios");
                    break;
                default:
                    System.out.println("No es una opcion");
                    break;
            }
        } while (opcion != 8);
    }

}
