
import java.util.Scanner;

public class Retornar {

    public static void main(String[] args) {

        pedirNumero();
       

    }

    public static void pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese numero 1 ");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese numero 2");
        int num2 = entrada.nextInt();
        System.out.println("Suma es ;" + sumarNumeros(num1, num2));
    }

    public static int sumarNumeros(int num1, int num2) {
       int respuesta;
        respuesta = num1 + num2;
        return respuesta;
    }
}
