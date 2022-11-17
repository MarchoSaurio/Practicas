package lista;

import javax.swing.JOptionPane;

public class listaNombres {

    public static void main(String[] args) throws ExcepcionDeListaLlena, ExcepcionDeListaVacia {
        ListaOrdenada<String> l = new ListaOrdenada(30);
        int b = 0;
        String c = "";
        String[] a = {"Mauricio", "Abraham", "Ricardo", "Jimena", "Omar", "Vanessa", "Mario", "Maria", "Jesus"};
        for (int i = 0; i <= a.length - 1; i++) {
            l.add(a[i]);
        }
        do {
            b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion: \n"
                    + "1.- Mostrar el primer elemento.\n"
                    + "2.- Mostrar el ienesimo elemento.\n"
                    + "3.- Mostrar el ultimo elemento.\n"
                    + "4.- Cantidad de elementos en la lista.\n"
                    + "5.- Eliminar el primer elemento.\n"
                    + "6.- Elimina un nombre en especifico.\n"
                    + "7.- Terminar el programa"));
            switch (b) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Primer elemento de la lista: " + l.first());
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Ienesimo elemento de la lista: " + l.first());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Ultimo elemento de la lista: " + l.last());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Numero de elementos contenidos: " + l.size());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Elemento eliminado: " + l.first());
                    l.deleteFirst();
                    break;
                case 6:
                    c = JOptionPane.showInputDialog("Nombre a eliminar: ");
                    l.delete(c);
                    JOptionPane.showMessageDialog(null, "ELIMINADO!!");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "ADIOS");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPCION NO VALIDA");
                    break;
            }
        } while (b != 7);
    }
}
