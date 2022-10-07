package test;

public class TestArreglo {
    public static void main(String[] args) {
        int edades[] = new int[3];
        //System.out.println("edades = " + edades);
        
        edades[0] = 10;
        System.out.println("edades 1 = " + edades[0]);
        edades[1] = 9;
        System.out.println("edades 2 = " + edades[1]);
        edades[2] = 8;
        System.out.println("edades 3 = " + edades[2]);
        
        //Otra forma de imprimir el arreglo es usando el ciclo FOR
        System.out.println("Arreglo con ciclo for");
        for (int i = 0; i < edades.length; i++) {
            
            System.out.println("Arreglo " + i +" : " + edades[i]);
        }
        
    }
}
