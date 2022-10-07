package Operaciones;

public class Main {

    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica();
        aritmetica.numero1 = 5;
        aritmetica.numero2 = 17;
        aritmetica.sumar();

        //LLamanos al metodo con retorno
        int resultado = aritmetica.sumaConRetorno();
        System.out.println("Resultado Con Retorno = " + resultado);

        //Metodo con argumento 
        int respuesta = aritmetica.sumarConParametros(12, 13);
        System.out.println("Respuestaaaaa con argumento "+ respuesta);

    }
}
