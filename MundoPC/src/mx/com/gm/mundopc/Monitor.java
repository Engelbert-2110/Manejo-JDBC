package mx.com.gm.mundopc;

public class Monitor {
    private int idMonitor;
    private int contadorMonitor;
    private double tamanio;
    private String marca;
    
    public Monitor(){
        this.idMonitor = ++this.contadorMonitor;
    }
    
    public Monitor (String marca, double tamanio){
        this();
        this.marca = marca;
        this.tamanio = tamanio;           
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamaño) {
        this.tamanio = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor {");
        sb.append("idMonitor = ").append(idMonitor);
        sb.append(", tamanio = ").append(tamanio);
        sb.append(", marca = ").append(marca);
        sb.append(", contadorMonitor = ").append(contadorMonitor);
        sb.append('}');
        return sb.toString();
    }
    
    
}
