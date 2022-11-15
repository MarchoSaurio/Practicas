/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas.app;

public class Pieza {
    private int numero;
    private String descripcion;
    
    public Pieza(int numero,String descripcion){
        this.numero=numero;
        this.descripcion=descripcion;
    }

    public int getNumero() {
        return numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Pieza [numero=" + numero + ", descripcion=" + descripcion + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numero;
        result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pieza other = (Pieza) obj;
        if (numero != other.numero)
            return false;
        if (descripcion == null) {
            if (other.descripcion != null)
                return false;
        } else if (!descripcion.equals(other.descripcion))
            return false;
        return true;
    }
    
}
