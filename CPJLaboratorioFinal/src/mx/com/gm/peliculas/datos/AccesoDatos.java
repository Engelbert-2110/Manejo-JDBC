package mx.com.gm.peliculas.datos;

import java.util.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

public interface AccesoDatos   {

boolean existe(String nombreArchivo) throws AccesoDatosEx;

List<Pelicula> listar (String nombre) throws LecturaDatosEx;

void escribir (Pelicula pelicula, String nombre, boolean anexar) throws EscrituraDatosEx;

String buscar (String nombreArchivo, String buscar) throws LecturaDatosEx;

void crear (String nombreArchivo) throws EscrituraDatosEx;

void borrar(String nombreArchivo) throws AccesoDatosEx;
}
