package pasoporreferencia;

import claseobjeto.Persona;

public class PasoPorReferencia {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Esteban";
        persona1.Apellido = "Estrada";
        System.out.println("Mi nombre es: = " + persona1.nombre);
        System.out.println("Mi apellido es: " + persona1.Apellido);
        cambiatValor(persona1);
        System.out.println("Mi nuevo nombre es: = " + persona1.nombre);
        System.out.println("Mi nuevo apellido es: " + persona1.Apellido);
    }

    public static void cambiatValor(Persona persona) {
        persona.nombre = "Amely";
        persona.Apellido = "Orozco";
    }
}
