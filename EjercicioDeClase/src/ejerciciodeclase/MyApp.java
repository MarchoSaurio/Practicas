package ejerciciodeclase;

public class MyApp {
    
    public static void main(String[] args) {
        
        EjercioDeClase e = new EjercioDeClase();
        
        int[] prueba = {1,2,1,3,1,5,1,10};
        boolean []  autobus ={true,false,true,false,true};
        
        
    
          
        System.out.println("El digito menos significativo es: "+e.problema1(723983));
        System.out.println("El digito mas significativo es: "+e.problema2(723983));
        System.out.println("Numero de veces que se repite el digito: "+e.problema3(1284823,2));
        System.out.println("El numero original es: "+e.problema4(2123813));
        System.out.println("Valor mayor del arreglo: "+e.problema5(prueba));
        System.out.println("Suma de enteros localizados en posiciones impares: "+e.problema6(prueba));
        System.out.println("Numero de palabras de la cadena: "+e.problema7("Esta oracion tiene cinco palabras"));
        System.out.println(e.problema8(autobus));
        
}
}
