package mx.com.gm.mundopc;

public class Computadora {
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private  int contadorComputadora;
    
    public Computadora(){
        this.idComputadora = ++contadorComputadora;
    }
    
    public Computadora(String nombre,Monitor monitor, Teclado teclado, Raton raton){
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.raton = raton;
        this.teclado = teclado;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computadora{");
        sb.append("idComputadora = ").append(idComputadora);
        sb.append(", nombre = ").append(nombre);
        sb.append(", monitor = ").append(monitor);
        sb.append(", teclado = ").append(teclado);
        sb.append(", raton = ").append(raton);
        sb.append('}');
        return sb.toString();
    }
    
    
}
