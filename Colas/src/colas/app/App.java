/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas.app;
import colas.newpackage.*;
import javax.swing.JOptionPane;

public class App {

    static ColaDinamica<Pieza> c= new ColaDinamica<Pieza>(10);

    static int menu(){
        int opc=0;
        String[] datos={"1.- Llegada de Pieza",
                        "2.- Primera Pieza",
                        "3.- Ultima pieza",
                        "4.- Cantidad de piezas",
                        "5.- Limpiar cola de piezas",
                        "6.- Buscar una pieza en la cola",
                        "7.- Terminar el programa"};
        String x=(String)JOptionPane.showInputDialog(null,"Seleccione uno", "Menu",
        JOptionPane.INFORMATION_MESSAGE, null,datos,datos[0]);
        opc=Integer.parseInt(x.charAt(0)+"");
        return opc;
    }

    static void llegada(){
        Pieza p= new Pieza(0,"");
        p.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Proporciono número de pieza:")));
        p.setDescripcion(JOptionPane.showInputDialog(null, "Proporciona descripción de pieza:"));
        try{
            c.add(p);
        }catch(ExcepcionDeColaLlena e){
            System.err.println(e.getMessage());
        }
    }

    static void primera(){
        try{
          Pieza p=c.first();
          JOptionPane.showMessageDialog(null, p, "Primera Pieza", 0);
        }catch(ExcepcionDeColaVacia e){
            System.err.println(e.getMessage());
        }
    }

    static void cantidad(){
        JOptionPane.showMessageDialog(null, "Cantidad de Piezas="+c.size(), "Total de piezas", 0);
    }

    static void ultima(){
        try{
          Pieza p=c.last();
          JOptionPane.showMessageDialog(null, p, "Ultima Pieza", 0);
        }catch(ExcepcionDeColaVacia e){
            System.err.println(e.getMessage());
        }
    }

    static void buscar(){
        Pieza p= new Pieza(0,"");
        p.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Proporciono número de pieza a buscar:")));
        p.setDescripcion(JOptionPane.showInputDialog(null, "Proporciona descripción de pieza a buscar:"));
        int i=c.search(p);
        if(i==-1)
           JOptionPane.showMessageDialog(null, "No se localiza dicha pieza");
        else
           JOptionPane.showMessageDialog(null, p+"\nSe localiza en la posición:"+i);
    }

    static void run(){
        boolean salir=false;
        while(!salir){
          switch(menu()) {
            case 1:llegada();break;
            case 2:primera();break;
            case 3:ultima();break;
            case 4:cantidad();break;
            case 5:c.clear();break;
            case 6:buscar();break;
            case 7: salir=true;
          }
        }
    }
    public static void main(String[] args) throws Exception {
        run();
    }
}
