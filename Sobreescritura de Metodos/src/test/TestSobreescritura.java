package test;

import domain.Empleado;
import domain.Gerente;
import java.util.Scanner;


public class TestSobreescritura {
    
    public static void main(String[] args) {
        
        pedirDatos();
       
    }
    
    //Imprimir detalles de tipo empleado con polimorfismo
    public static void imprimir(Empleado empleado){
        System.out.println("Empleado = "+ empleado.mostrarDetalles()); //Toma los dos metodos (mostrarDetalles) tanto clase padre e hija
    }
    
    public static void pedirDatos(){
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        String  departamento;
        String nombre;
        double sueldo;
        
        System.out.println("Ingrese los siguintes datos a la base ");
        System.out.println(" Nombre y Apellido");
        nombre = entrada.nextLine();
        System.out.println(" Sueldo fijo");
        sueldo = entrada.nextDouble();
        System.out.println(" Departamento de Trabajo");
        departamento = entrada2.nextLine();
        obtenerDatosEmpleado(nombre, sueldo, departamento);
             
    }
    
    public static void obtenerDatosEmpleado(String nombre, double sueldo, String departamento){
        Gerente gerente = new Gerente(nombre, sueldo, departamento);
        imprimir(gerente);
    }
    
   
}
