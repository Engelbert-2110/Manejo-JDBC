package mx.com.gm.pelicula.negocio;

import mx.com.gm.peliculas.excepciones.*;

public interface CatalogoPelicula {
    
    void agregarPelicula (String nombrePelicula, String nombreArchivo) ;
    
    void listarPelicula(String nombreArchivo);
    
    void buscarPelicula(String nombreArchivo , String buscar);
    
    void iniciarArchivo(String nombreArchivo); 
}
