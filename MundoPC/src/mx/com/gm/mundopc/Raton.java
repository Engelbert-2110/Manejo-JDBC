package mx.com.gm.mundopc;

public class Raton extends DispositivoEntrada  {
    private int idRaton;
    private int contadorRaton;
    
    public Raton(String tipoEntrada, String marca){
       super(tipoEntrada, marca);
       this.idRaton = ++this.contadorRaton;
    } 

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{");
        sb.append("idRaton = ").append(idRaton);
        sb.append(",").append(super.toString());
        sb.append(", contadorRaton = ").append(contadorRaton);
        sb.append('}');
        return sb.toString();
    }
        
    
}
