package test;

import domain.Empleado;
import domain.Gerente;
import java.util.Scanner;

public class TestInstanceOf {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Juan", 25000);
        determinarDatos(empleado);
        empleado = new Gerente("Emanuel", 35000, "sistemas");
        //determinarDatos(empleado);
    }

    //Instance Of
    public static void determinarDatos(Empleado empleado) {

        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo Gerente");
            System.out.println("Departamento = " +((Gerente) empleado).getDepartamento());
            System.out.println("Nombre = " + empleado.getNombre());
            System.out.println("Sueldo = " + empleado.getSueldo());
            
        }
        else if(empleado instanceof Empleado) {
            System.out.println("Es de tipo empleado");
            System.out.println("Nombre = " + empleado.getNombre());
            System.out.println("Sueldo = " + empleado.getSueldo());
          
        }
        else if (empleado instanceof Object) {
            System.out.println("Este es de tipo Object");
            System.out.println("Empleado = " + empleado.toString());
        }
    }

//    public static void pedirDatosEmpleado(){
//        Scanner entrada2 = new Scanner(System.in);
//        String nombre;
//        double sueldo;
//
//        System.out.println("Ingrese los siguintes datos a la base ");
//        System.out.println(" Nombre y Apellido");
//        nombre = entrada2.nextLine();
//        System.out.println(" Sueldo fijo");
//        sueldo = entrada2.nextDouble();
//        recibirInformacion(nombre, sueldo, null);
//    }
            
//    public static void pedirDatosGerente() {
//        Scanner entrada = new Scanner(System.in);
//        Scanner entrada2 = new Scanner(System.in);
//        String departamento;
//        String nombre;
//        double sueldo;
//
//        System.out.println("Ingrese los siguintes datos a la base ");
//        System.out.println(" Nombre y Apellido");
//        nombre = entrada.nextLine();
//        System.out.println(" Sueldo fijo");
//        sueldo = entrada.nextDouble();
//        System.out.println(" Departamento de Trabajo");
//        departamento = entrada2.nextLine();
//        recibirInformacion(nombre, sueldo, departamento);
//
//    }

//    public static void recibirInformacion(String nombre, double sueldo, String departamento) {
//        
//        Empleado empleado = new Empleado(nombre, sueldo);
//        
//        Gerente gerente = new Gerente(nombre, sueldo, departamento);   
//    }
    

}
