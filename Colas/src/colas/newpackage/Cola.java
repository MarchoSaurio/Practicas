/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas.newpackage;

public interface Cola<E> {
	public void add(E item) throws ExcepcionDeColaLlena;
	public E remove() throws ExcepcionDeColaVacia;
	public boolean isFull();
	public boolean isEmpty();
	public int size();
	public E first() throws ExcepcionDeColaVacia;
	public E last() throws ExcepcionDeColaVacia;
	public void clear();
	public int search(E item);
}

