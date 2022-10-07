
package LaboratorioCaja;


public class Prueba {
    public static void main(String[] args) {
        Caja caja1 = new Caja();
        caja1.ancho = 3;
        caja1.profundo = 4;
        caja1.alto = 5;
        System.out.println("volumen = " + caja1.calcularVolumen());
        
        Caja caja2 = new Caja(6, 3, 2);
        System.out.println("El voluemen de la caja es: " +caja2.calcularVolumen());
        
    }
}
