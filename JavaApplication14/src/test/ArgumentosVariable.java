package test;

public class ArgumentosVariable {
    public static void main(String[] args) {
        imprimirNumeros(1, 1 ,2);
    }
    
    private static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemenitos :" + numeros[i]);
        }
    }
}
