package colas.newpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ColaDinamica<E> implements Cola<E> {

    private NodoCola<E> primero;
    private NodoCola<E> ultimo;
    private int limite;
    private int n;

    public ColaDinamica() {
        this.primero = null;
        this.ultimo = null;
        this.limite = 0;
        this.n = 0;
    }

    public ColaDinamica(int limite) {
        this.primero = null;
        this.ultimo = null;
        this.limite = limite;
        this.n = 0;
    }

    /*
	 * (non-Javadoc)
	 * 
	 * @see colas.newpackage.Cola#add(java.lang.Object)
     */
    @Override
    public void add(E item) throws ExcepcionDeColaLlena {
        if (this.isFull()) {
            throw new ExcepcionDeColaLlena();
        }
        NodoCola<E> nuevo = new NodoCola<>(item);

        if (this.isEmpty()) {
            primero = ultimo = nuevo;
            n++;
        } else {
            this.ultimo.setSig(nuevo);
            this.ultimo = nuevo;
            n++;
        }
    }

    @Override
    public E remove() throws ExcepcionDeColaVacia {
        if (this.isEmpty()) {
            throw new ExcepcionDeColaVacia();
        }
        E aux = primero.item;
        primero = primero.getSig();
        n--;

        return aux;
    }

    @Override
    public int size() {
        return this.n;
    }

    @Override
    public E first() throws ExcepcionDeColaVacia {
        if (isEmpty()) {
            throw new ExcepcionDeColaVacia();
        }
        return primero.item;
    }

    @Override
    public boolean isFull() {
        return this.n == this.limite;
    }

    @Override
    public boolean isEmpty() {
        return this.n == 0;
    }

    @Override
    public E last() throws ExcepcionDeColaVacia {
        return ultimo.item;
    }

    @Override
    public void clear() {
        this.primero = this.ultimo = null;
        this.n = 0;
    }

    @Override
    public int search(E item) {
        NodoCola<E> a = this.primero;
        int i = 1, k = -1;
        while (a != null) {
            if (a.getItem().equals(item)) {
                k = i;
                break;
            }
            a = a.getSig();
            i++;
        }
        return k;
    }

}
