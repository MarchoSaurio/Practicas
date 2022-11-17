package lista;
import javax.swing.JOptionPane;
public class MyApp {
    
    public static void main(String [] args) throws ExcepcionDeListaLlena, ExcepcionDeListaVacia{
        ListaEstatica <Integer> l = new ListaEstatica <>(20);
        int a,b=0;   
        do{
        a=Integer.parseInt(JOptionPane.showInputDialog("Escoga una opcion: \n"
                + "1.-Ingresar un nuevo numero. \n"
                + "2.-Mostrar el primer elemento en la lista. \n"
                + "3.-Mostrar el ultimo elemento de la lista. \n"
                + "4.-Cantidad de elementos contenidos en la lista. \n"
                + "5.-Elimine el primer elemento de la lista. \n"
                + "6.-Elimine el ultimo elemento de la lista. \n"
                + "7.-Salir."));
        
        switch(a){
            case 1:
                b=Integer.parseInt(JOptionPane.showInputDialog("Numero a ingresar: "));
                l.add(b);
                System.out.println("Elemento agregado con exito \n");
                break;
            case 2:
                System.out.println("Primer elemento de la lista: "+l.first());  
                break;
            case 3:
                System.out.println("Ultimo elemento de la lista: "+l.last());
                break;
            case 4:
                System.out.println("Cantidad de elemento contenidos: "+l.size());
                break;
            case 5: 
                System.out.println("Primer elemento eliminado!!");
                l.deleteFirst();
                break;
            case 6: 
                System.out.println("Ultimo elemento eliminado!!");
                l.deleteLast();
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "ADIOS");
                //System.out.println(l.search(2));
                break;
            default:
                JOptionPane.showMessageDialog(null, "OPCION NO VALIDA");
                break;
                        
        }
        }while(a!=7);
    }
    
}
