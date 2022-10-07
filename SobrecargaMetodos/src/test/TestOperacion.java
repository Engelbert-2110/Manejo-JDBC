package test;

import operaciones.Operacion;

public class TestOperacion {

    public static void main(String[] args) {
        //Llamamos los metodos, pero sin crear objetos
        //Los metodos son static, entonces los podemos llamar sin crear objetos
        
        var resultado = Operacion.sumar(40, 21);
        System.out.println("resultado = " + resultado);
        
        var resultado2 = Operacion.sumar(37.9, 25);
        System.out.println("resultado2: " + resultado2);
        
        //L= es de tipo LONG, double tambien reconoce el tipo long.
        var resultado3 = Operacion.sumar(3, 5L);
        System.out.println("resultado3 = " + resultado3);
    }
}
