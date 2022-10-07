
public class Ciclos {

    public static void main(String[] args) {
        //Ciclo while
        var contador = 0;
        while (contador < 5) {
            System.out.println("contador = " + contador);
            break;
        }

        //ciclo for
        System.out.println("Ciclo for");
        for (contador = 0; contador < 5; contador++) {
            System.out.println("contador = " + contador);
            break;
        }
        
                //ciclo do while
        System.out.println("Ciclo do while");
        contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador < 5);
    }
}
