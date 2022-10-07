package test;

import domain.Persona;

public class TestJavaBeans {
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.setNombre("Emanuel");
        persona.setApellido("Estrada");
        persona.setEdad(22);
        System.out.println(persona.toString());
    }
}
