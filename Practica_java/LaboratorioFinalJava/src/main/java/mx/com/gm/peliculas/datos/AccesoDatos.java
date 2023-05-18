package mx.com.gm.peliculas.datos;

import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

import java.util.List;

public interface AccesoDatos {

    boolean Existe(String nombreArchivo);
    List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx;

    void escribir(Pelicula pelicula , String nombre ,boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreArchivo,String buscar) throws LecturaDatosEx;

    void crear(String nombreArchivo) throws AccesoDatosEx;
    void borrar(String nombreArchivo) throws AccesoDatosEx;
}
