package mx.com.gm.mundopc;

public class Orden {

    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrden;
    private int contadorComputadora;
    private final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrden;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadoras(Computadora computadora) {
        if (this.contadorComputadora < this.MAX_COMPUTADORAS) {
            computadoras[contadorComputadora++] = computadora;
        } else {
            System.out.println("Se ha superado el maximo de computadoras " + Orden.contadorOrden);
        }
    }
    
    public void mostrarOrden(){
        System.out.println("Orden No: " + this.idOrden);
        System.out.println("\nMostrar Computadoras");
        for (int i = 0; i < this.contadorComputadora; i++) {
            System.out.println(computadoras[i]);
        }
    }
}
