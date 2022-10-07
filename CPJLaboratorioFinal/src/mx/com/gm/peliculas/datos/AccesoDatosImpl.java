package mx.com.gm.peliculas.datos;

import java.io.*;
import java.util.*;
import mx.com.gm.peliculas.domain.*;
import mx.com.gm.peliculas.excepciones.*;

public class AccesoDatosImpl implements AccesoDatos {

    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosEx {
        //File archivo = new File(nombreArchivo);
        var archivo = new File(nombreArchivo);             //La lìnea de còdigo de arriba tambièn es funcional
        return archivo.exists();                            //verifìca si existe el archivo en el "disco C"
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
        var archivo = new File(nombreArchivo);     //Creamos variable (archivo) para recibir un archivo
        List<Pelicula> peliculas = new ArrayList<>();     //ArrayList para almacenar peliculas (Espacio vacio, indefinido)
        try {
            var entrada = new BufferedReader(new FileReader(archivo));     //Muestra las peliculas que hay en el archivo para almacenarlos a (entrada)
            String linea = null;                           //Linea vacia, nula
            linea = entrada.readLine();                  //Leè cada linea del archivo, que se almacenan en entrada
            while (linea != null) {                      //Si la linea esta vacia termina el ciclo, si contiene algo sigue...
                var pelicula = new Pelicula(linea);     //se le pasa la linea (contenido que obtuvo al leer la 1er linea) a la variable pelicula
                //System.out.println("Pelicula : " + pelicula.getNombre());
                peliculas.add(pelicula);                //se agrega la pelicula a el ArrayList (Guarda las peliculas que existen en el archivo)
                linea = entrada.readLine();                //Leè nuevamente la linea (Si esta vacia termina el ciclo, si contiene informacion continua)
            }
            entrada.close();                                //Cierra la lectura del archivo
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion para listar pelicula");
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion para listar pelicula");
        }
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {

        File archivo = new File(nombreArchivo);
        try {
            var salida = new PrintWriter(new FileWriter(nombreArchivo, anexar));
            salida.println(pelicula.getNombre());
            salida.close();
            System.out.println("Se ha agregado tu pelicula con anexo" + pelicula);

        } catch (IOException ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEx("Excepcion al escribir pelicula");
        }

    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
        File archivo = new File(nombreArchivo);
        String resultado = null;

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();

            while (linea != null) {
                if (buscar != null && linea.equalsIgnoreCase(buscar)) {
                    //System.out.println("Resultados en peliculas : " + linea);
                    resultado = "Pelicula : " + linea;

                }
                linea = entrada.readLine();

            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("No se ha encontrado el archivo indicado");
            //archivo excepcion
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Manejo de excepcion al leer archivo");
            //no se encontro
        }

        return resultado;
    }

    @Override
    public void crear(String nombreArchivo) throws EscrituraDatosEx {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEx("No existe el archivo");
        }
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {
        var archivo = new File(nombreArchivo);
        archivo.delete();
    }

}
