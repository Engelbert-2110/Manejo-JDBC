package domain;

public enum TipoEscritura {
    CLASICO("Tipo de escritura a mano"),
    MODERNA("Tipo de Escritura en digital");
    
    private String tipoEscritura;
    
    private TipoEscritura (String tipoEscritura){
        this.tipoEscritura = tipoEscritura;
    }

    public String getTipoEscritura() {
        return tipoEscritura;
    }
    
   
}
