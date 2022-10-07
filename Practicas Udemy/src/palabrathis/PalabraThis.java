
package palabrathis;

public class PalabraThis {

    public static void main(String[] args) {
        Persona persona = new Persona("Emmauel", "Socorro");
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre: " + persona.nombre);
        System.out.println("Persona apellido: " + persona.apellido);

    }

}

class Persona {

    //Atributos
    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this = " + this);
        //Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
    }

}

class Imprimir {

    //Creamos un metodo imprimir
    public void imprimir(Persona persona) {
        System.out.println("Persona desde Imprimir = " + persona);
        System.out.println("Impresion del Objeto actual(this) " + this);
    }
}
