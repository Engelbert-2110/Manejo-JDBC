package test;

import domain.Cliente;
import java.util.Date;

public class TextHerencia {
    public static void main(String[] args) {
//        Empleado empleado = new Empleado("Maribel", 12000.0);
//        System.out.println("empleado = " + empleado);
        Cliente cliente = new Cliente(new Date(), true, "Beliberto",'F', 45, "San Antonio Sac.");
        System.out.println("cliente = " + cliente);
        
        
        
    }
}
