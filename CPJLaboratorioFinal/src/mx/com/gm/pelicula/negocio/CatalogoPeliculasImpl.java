package mx.com.gm.pelicula.negocio;

import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.StyledEditorKit;
import mx.com.gm.peliculas.datos.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

public class CatalogoPeliculasImpl implements CatalogoPelicula {

    AccesoDatos datos = new AccesoDatosImpl();

    public CatalogoPeliculasImpl() {

    }

    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
        
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        
        try {
            anexar = datos.existe(nombreArchivo); //verifica si existe el archivo en nuestro disco
            datos.escribir(pelicula, nombreArchivo, anexar); //escribe las peliculas al archivo, si es el caso de que exista
            
//        if (nombrePelicula != "") {
//            Pelicula pelicula = new Pelicula(nombrePelicula);
//            try {
//                datos.escribir(pelicula, nombreArchivo, true);
//            } catch (EscrituraDatosEx ex) {
//                ex.printStackTrace();
//            }
//        }else{
//            System.out.println("Ingrese una pelicula vaiida");
//        }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso de datos");
            ex.printStackTrace(System.out);
        }
        
        
        
    }

    @Override
    public void listarPelicula(String nombreArchivo) {

        try { 
            var peliculas = datos.listar(nombreArchivo);
            for (var pelicula : peliculas) {
                System.out.println(pelicula);
            }
            
        } catch (LecturaDatosEx ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        
        String resultado = null;
        try {
            resultado = datos.buscar(nombreArchivo, buscar);
        } catch (LecturaDatosEx ex) {
            System.out.println("Error al acesso de datos");
            ex.printStackTrace(System.out);
        }
        System.out.println("resultado = " + resultado);
        
        
//        try {
//            System.out.println(datos.buscar(nombreArchivo, buscar));
//            //datos.buscar(nombreArchivo, buscar);
//        } catch (LecturaDatosEx ex) {
//            ex.printStackTrace();
//        }
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
      
        try {
            if (datos.existe(nombreArchivo)) {
                datos.borrar(nombreArchivo);
                datos.crear(nombreArchivo);
                System.out.println("Se ha creado el archivo");
            }
            else{
                datos.crear(nombreArchivo);
                System.out.println("Se ha creado el archivo");
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar el catalogo de peliculas");
            ex.printStackTrace(System.out);
        }
    }

}
