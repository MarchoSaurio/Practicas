/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

public class NodoLista<E> {
	private E item;
	private NodoLista<E> sig;
	
	public NodoLista(E item) {
		this.setItem(item);
		this.setSig(null);
	}

	public E getItem() {
		return item;
	}

	public void setItem(E item) {
		this.item = item;
	}

	public NodoLista<E> getSig() {
		return sig;
	}

	public void setSig(NodoLista<E> sig) {
		this.sig = sig;
	}
	
}

