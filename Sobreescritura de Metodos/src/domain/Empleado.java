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
}
