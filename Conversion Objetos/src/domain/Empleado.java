package domain;

public class Empleado {
    //Atributos
    protected String nombre;
    protected double sueldo;
    
    //constructor
    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    //Metodo para la sobreescritura
    public String mostrarDetalles (){
        return "Nombre: " +this.nombre + ", Sueldo: " + this.sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
