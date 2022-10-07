package test;

import domain.Empleado;
import domain.Escritor;
import domain.Gerente;
import domain.TipoEscritura;

public class testConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Engelbert", 100000.0, TipoEscritura.CLASICO);
        //System.out.println("empleado = " + empleado.mostrarDetalles());
        
        //Downcasting
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        
        //Upcasting
        Empleado empleado2 = escritor;
        System.out.println(empleado2.mostrarDetalles());
    }
            
}
