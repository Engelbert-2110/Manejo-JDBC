package domain;

public class Empleado extends Persona {
    
    //Atributod de empleado
    private int idEmpleado;
    private double sueldo;
    private static int idContador;
    
    //creamos constructor de empleado extendido de persona el nombre 

    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.sueldo = sueldo;
//        Empleado.idContador++;
//        this.idEmpleado = Empleado.idContador;
        this.idEmpleado  = ++Empleado.idContador; //Funciona de igual manera, solo que con diferente estructura de codigo
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public static int getIdContador() {
        return idContador;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado = ").append(idEmpleado);
        sb.append(", sueldo = ").append(sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
