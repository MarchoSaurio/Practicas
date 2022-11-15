/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas.newpackage;

public class ExcepcionDeColaLlena extends Exception{

	public ExcepcionDeColaLlena() {
		super("La cola esta llena!!");
	}
}

