package LaboratorioCaja;

public class Caja {

    //Atributo
    int ancho;
    int profundo;
    int alto;

    //metodo
    public Caja() {
        calcularVolumen();
    }

    public Caja(int ancho, int profundo, int alto) {
        this.ancho = ancho;
        this.profundo = profundo;
        this.alto = alto;
    }

    public int calcularVolumen() {
        //System.out.println("EL volumen es: "+(this.ancho * this.profundo * this.alto));
        return this.ancho * this.profundo * this.alto;
    }

}
