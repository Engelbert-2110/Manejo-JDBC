package mx.com.gm.venta.test;
    
import mx.com.gm.venta.Orden;
import mx.com.gm.venta.Producto;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa Barca", 150.0);
        Producto producto2 = new Producto("Zapatos", 150.0);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto2);
        orden2.agregarProducto(producto1);
        orden2.mostrarOrden();
    }
}
