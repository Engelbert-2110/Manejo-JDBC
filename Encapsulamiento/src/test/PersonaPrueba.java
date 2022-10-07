package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Emanuel", 9000.00, false);
//        System.out.println("Nombre Persona: " + persona1.getNombre());
//        System.out.println("Sueldo : "+ persona1.getsueldo());
//        System.out.println("Eliminado: " + persona1.isEliminado());
        System.out.println("Persona: " + persona1);//Tambien se puede con => persona1.toString()
        
        persona1.setNombre("Amely Maribel");
        persona1.setSueldo(25000.00);
        persona1.setEliminado(true);
        
//        System.out.println("Nombre con cambio: " + persona1.getNombre());
//        System.out.println("Sueldo con cambio: " + persona1.getsueldo());
//        System.out.println("Eliminado con cambio: " + persona1.isEliminado());
        System.out.println("Persona: " + persona1);    
    }
}
