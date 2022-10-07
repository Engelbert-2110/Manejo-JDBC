package domain;

import java.util.logging.Logger;

public class Escritor extends Empleado {
    
    final TipoEscritura tipoEscritura;
    
    public Escritor (String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    @Override 
    public String mostrarDetalles(){
        return super.mostrarDetalles() + "Tipo Escritura : " + tipoEscritura.getTipoEscritura();
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }
    
    
    

    @Override
    public String toString() {
        return "Escritor{" + "tipoEscritura=" + tipoEscritura + super.toString() + '}';
    }
    
    
}
