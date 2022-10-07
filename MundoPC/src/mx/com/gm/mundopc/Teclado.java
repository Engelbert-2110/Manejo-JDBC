package mx.com.gm.mundopc;

public class Teclado extends DispositivoEntrada {
    private int idTeclado;
    private int contadorTeclado;
    
    public Teclado (String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado = ++this.contadorTeclado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado{");
        sb.append("idTeclado = ").append(idTeclado);
        sb.append(",").append(super.toString());
        sb.append(", contadorTeclado =").append(contadorTeclado);
        sb.append('}');
        return sb.toString();
    }
    
    
}
