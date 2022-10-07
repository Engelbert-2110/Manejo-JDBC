package Test;

import domain.Persona;

public class TestForEach {

    public static void main(String[] args) {
       
        int edades[] = {19, 22, 20, 25};   //creamos nuestro arreglo
        
        //forEach
        for (int edad : edades) {    //recorre todas las edades de nuestro arreglo
            System.out.println("edad = " + edad);
        }
        
        //Creamos el objeto arreglo[] de tipo Persona
        Persona personas1[] = {new Persona("Emanuel"), new Persona("Carlos"), new Persona("Bryan")};
        
        //ForEach
        for(Persona persona: personas1){
            System.out.println("persona = " + persona);
        }
    }
}
