package hash;

import hash.newpackage.*;
import lista.ListaOrdenada;

public class Hash {

    static ListaOrdenada<Docente>[] hashTable;
    static final int LIMITE = 150;

    static void inicializa() {
        hashTable = new ListaOrdenada[LIMITE];
        for (int i = 0; i < LIMITE; i++) {
            hashTable[i] = new ListaOrdenada<>();
        }
    }

    static void agregaMaestro(Docente m) {
        try {

            hashTable[m.hashCodeYourCedula()].add(m);

        } catch (Exception e) {

        }
    }

    static void eliminarMaestro(Docente m) {
        try {
            hashTable[m.hashCodeYourCedula()].delete(m);
        } catch (Exception e) {

        }
    }

    static Docente buscaMaestro(int cedula) {
        Docente m = null;
        int i = 0;
        ListaOrdenada<Docente> lista = hashTable[Docente.hashCode(cedula)];
        try {
            for (i = 0; i < lista.size(); i++) {
                if (lista.getItem(i).getCedula() == cedula) {
                    m = lista.getItem(i);
                    break;
                }
            }
        } catch (Exception e) {

        }
        return m;
    }

    static void imprimeTabla() {
        try {
            for (int i = 0; i < LIMITE; i++) {
                ListaOrdenada<Docente> l = hashTable[i];
                for (int j = 0; j < l.size(); j++) {
                    System.out.println(l.getItem(j));
                }
            }
        } catch (Exception e) {

        }
    }

    static void run() {

        inicializa();
        Docente m = new Docente(948, "MARTIN", "DOCENTE", 2002, 1342.3f, "MAESTRO");
        agregaMaestro(m);
        m = new Docente(99, "PEDRO", "DOCENTE", 1998, 2134.3f, "ENCARGADO");
        agregaMaestro(m);
        m = new Docente(5469, "ESTEBAN", "DOCENTE", 1992, 4134.3f, "SECRETARIO");
        agregaMaestro(m);
        m = new Docente(769, "FERNANDO", "DOCENTE", 2000, 1434.3f, "MAESTRO");
        agregaMaestro(m);
        m = new Docente(23659, "MARIA", "DOCENTE", 2003, 1634.3f, "MAESTRO");
        agregaMaestro(m);
        m = new Docente(763476328, "MARIO", "DOCENTE", 1989, 8134.3f, "ADMINISTRADOR");
        agregaMaestro(m);
        m = new Docente(968273469, "JOYSAN", "DOCENTE", 1997, 7134.3f, "COORDINADOR");
        agregaMaestro(m);
        m = new Docente(141229, "GABRIELA", "DOCENTE", 2002, 1234.3f, "ASESOR");
        agregaMaestro(m);
        m = new Docente(134263, "ENRIQUE", "DOCENTE", 2001, 8134.3f, "MAESTRO");
        agregaMaestro(m);
        m = new Docente(2, "ANTONIO", "DOCENTE", 2011, 1384.3f, "MAESTRO");
        agregaMaestro(m);
        m = new Docente(399, "RODRIGO", "DOCENTE", 2008, 1434.3f, "ASESOR");
        agregaMaestro(m);
        m = new Docente(1736298, "JAIME", "DOCENTE", 2021, 3134.3f, "ENCARGADO");
        agregaMaestro(m);
        imprimeTabla();
        
       System.out.println(buscaMaestro(1234));

    }

    public static void main(String[] args) {
        run();
    }

}
