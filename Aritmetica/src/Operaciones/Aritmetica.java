package Operaciones;

public class Aritmetica {

    //Atributos
    int numero1;
    int numero2;

    //Metodo vacio
    public void sumar() {
        int resultado = numero1 + numero2;
        System.out.println("resultado = " + resultado);
    }

    //Metodo con Retorno
    public int sumaConRetorno() {
        return this.numero1 + this.numero2;
    }

    //Metodo con argumentos ò parametros
    public int sumarConParametros(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        return this.sumaConRetorno();
    }

}
