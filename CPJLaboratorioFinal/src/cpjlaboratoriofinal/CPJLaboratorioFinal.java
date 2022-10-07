package cpjlaboratoriofinal;

import java.util.Scanner;
import mx.com.gm.pelicula.negocio.CatalogoPelicula;
import mx.com.gm.pelicula.negocio.CatalogoPeliculasImpl;

public class CPJLaboratorioFinal {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner entrada2 = new Scanner(System.in);
        CatalogoPeliculasImpl catalogo = new CatalogoPeliculasImpl();

        var nombreArchivo = "Peliculas.txt";

        int opcion;
        do {
            System.out.println("\tMENU");
            System.out.println("¿ELIGUE UNA OPCION?");
            System.out.println("1.- iniciar Catalogo Peliculas");
            System.out.println("2.- Agregar Pelicula");
            System.out.println("3.- Listar Peliculas");
            System.out.println("4.- Buscar Pelicula");
            System.out.println("0.- SALIR ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    catalogo.iniciarArchivo(nombreArchivo);
                    break;
                case 2:
                    System.out.println("\t AGREGAR");
                    System.out.println("Ingrese una pelicula");
                    String nomPelicula = entrada2.nextLine();
                    catalogo.agregarPelicula(nomPelicula, nombreArchivo);
                    break;
                    
                case 3:
                    System.out.println("\t lISTAR");
                    System.out.println("Resultado de Peliculas");
                    catalogo.listarPelicula(nombreArchivo);
                    break;
                    
                case 4:
                    System.out.println("\t BUSCAR");
                    System.out.println("Ingresa la Pelicula a buscar");
                    String busqueda = entrada2.nextLine();
                    catalogo.buscarPelicula(nombreArchivo, busqueda);
                    break;
                case 0:
                    System.out.println("Hasta pronto");
                    break;

                default:
                    System.out.println("OPcion no valida");
                    break;

            }

        } while (opcion != 0);

    }

}
