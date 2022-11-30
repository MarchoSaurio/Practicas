package hash.newpackage;

public class Docente implements Comparable{
    private int cedula;
    private String nombre, profesion;
    private int a;
    private float sueldo;
    private String puesto;

    public Docente(int cedula, String nombre, String profesion, int a, float sueldo, String puesto) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.profesion = profesion;
        this.a = a;
        this.sueldo = sueldo;
        this.puesto = puesto;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public int hashCodeYourCedula(){
        final int prime= 11;
        long resultado =0;
        long copiaCedula = cedula;
        while(copiaCedula!=0){
            resultado=(resultado*prime+(copiaCedula%10))%150;
            copiaCedula = copiaCedula/10;
        }
        return (int) resultado;
    }
    public static int hashCode(int cedula){
       final int prime= 11;
        long resultado =0;
        while(cedula!=0){
            resultado=(resultado*prime+(cedula%10))%150;
            cedula = cedula/10;
        }
        return (int) resultado;
    }
    
    @Override
    public int compareTo(Object t) {
        Docente m = (Docente) t;
        return this.cedula-m.getCedula();
    }

    @Override
    public String toString() {
        return "Maestro{" + "cedula=" + cedula + ", nombre=" + nombre + ", profesion=" + profesion + ", año=" + a + ", sueldo=" + sueldo + ", puesto=" + puesto + ",Lugar: "+hashCodeYourCedula()+'}';
    }
    
}
