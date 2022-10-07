package domain;

public class Persona {
    //Atributos, Estatico y no Estatico(Dinamico)
    private final int idPersona;           //Atributo no Estatico
    private static int contadorPersona;    //Atributo Estatico

    //Creamos el bloque estatico
    static{
        System.out.println("Ejecucio bloque estatico");
        ++Persona.contadorPersona;     //Usamos el atributo estatico y le hacemos un posincremento
    }
    
    //Creamos el bloque no estatico
    { 
        System.out.println("Ejecucion del bloque NO estatico (Dinamico)");
        this.idPersona = Persona.contadorPersona;
    }
    
    //Creamos el contador
    public Persona(){
        System.out.println("Ejecutamos el contador");
           
    }
}
