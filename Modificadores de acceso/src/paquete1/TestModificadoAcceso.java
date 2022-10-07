package paquete1;

import paquete1.Clase1;
import paquete1.ClaseHija;

public class TestModificadoAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1("Acceso Publico");
        
        //Imprimimos atributo con get
        System.out.println("Atributo privado : " + clase1.getAtributoprivado());
        
        //Modificamos el atributo privado con set e imprimimos con get
        clase1.setAtributoprivado("Nuevo atributo privado");
        System.out.println("Modificamos atributo: " + clase1.getAtributoprivado());

  
    }
}
