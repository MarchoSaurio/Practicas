
package practica2;

import java.util.ArrayList;

public class Practica2 {

    public static void main(String[] args) {
        
        Metodos m = new Metodos();
        
        float [] a = {12.3f,1.3f,1.3f,11.2f};
        int [] b = {1,5,4,5,3,3,2,1,1,2,3,4,4,3,3,2,2,5,5,5,1,1,2,3,4,5,3,3,2,1};
        
        //System.out.println(m.digitosPares(12345222));
        //System.out.println(m.esPalindromo("Reconocer"));
        //System.out.println(m.esCapicua(192));
       // System.out.println(m.cantidadRepetida(a, 12.3f));
        int [] c=m.coleccion(b);
        for(int i=0; i<c.length;i++){
            System.out.println(c[i]);
            
        }
        int [] d ={1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
        
        System.out.println("*********************************************************************************************************"); 
       Imagen img = new Imagen (5,5,d);
        ArrayList<Integer> colores=m.GetColores(img);
        for(int j=0; j<colores.size();j++){
            System.out.println(colores.get(j));      
        }
       
    }
    
}
