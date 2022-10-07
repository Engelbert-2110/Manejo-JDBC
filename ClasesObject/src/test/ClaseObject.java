package test;

import domain.Empleado;

public class ClaseObject {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Emanuel", 50000);
        Empleado empleado1 = new Empleado("Emanuel", 50000);

        if (empleado == empleado1) {
            System.out.println("Utilizan la misma referencia en memoria");
        } else {
            System.out.println("Utilizan diferentes referencias en memoria");
        }

        if (empleado.equals(empleado1)) {
            System.out.println("Los Contienen son iguales en los objetos");
        } else {
            System.out.println("El contenido no son iguales ");
        }

        if (empleado.hashCode() == empleado1.hashCode()) {
            System.out.println("Son iguales");

        } else {
            System.out.println("No son iguales");
        }
    }
}
