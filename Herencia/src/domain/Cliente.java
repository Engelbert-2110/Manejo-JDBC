package domain;

import java.util.Date;

public class Cliente extends Persona {

    //Atributos
    private int idCliente;
    private Date fechaDeRegistro;
    private boolean vip;
    private static int contadorCliente;

    public Cliente(Date fechaDeRegistro, boolean vip,String nombre, 
            char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.fechaDeRegistro = fechaDeRegistro;
        this.vip = vip;
        this.idCliente = ++Cliente.contadorCliente;
    }

//    public Cliente(int idCliente, Date fechaDeRegistro, boolean vip) {
//        this.idCliente = idCliente;
//        this.fechaDeRegistro = fechaDeRegistro;
//        this.vip = vip;
//    }
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    public void setFechaDeRegistro(Date fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente =" ).append(idCliente);
        sb.append(", fechaDeRegistro = ").append(fechaDeRegistro);
        sb.append(", vip = ").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
