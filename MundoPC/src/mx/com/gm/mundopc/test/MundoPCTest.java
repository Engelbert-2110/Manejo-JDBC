package mx.com.gm.mundopc.test;

import mx.com.gm.mundopc.Computadora;
import mx.com.gm.mundopc.*;

public class MundoPCTest {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor("Samsung", 15.6);
        Raton raton1 = new Raton("USB", "casio");
        Teclado teclado1 = new Teclado("USB", "Casio");
        Computadora computadora1 = new Computadora("Dell", monitor1, teclado1, raton1);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadoras(computadora1);
        orden1.mostrarOrden();
        
    }
}
