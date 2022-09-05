
package practicauno;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Arrays;


public class PracticaUno {

   
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Granja g = new Granja ("C:\\Users\\POWERMARS\\Documents\\Prueba.txt");
        System.out.println(g.ObtenerPromedioVacas());
        System.out.println(g.ObtenerPromedioCabras());
        System.out.println(Arrays.toString(g.Vacas_Max()));
        System.out.println(Arrays.toString(g.Cabras_Max()));
    }
    
}
