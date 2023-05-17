package mx.com.gm.peliculas.negocio;

import mx.com.gm.peliculas.datos.AccesoDatos;
import mx.com.gm.peliculas.domain.Pelicula;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class CatalagoPeliculasImpl implements AccesoDatos {
    @Override
    public boolean Existe(String nombreArchivo) {
        return false;
    }

    @Override
    public List<Pelicula> listar() {
        return null;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombre, boolean anexar) {

    }

    @Override
    public String buscar(String nombreArchivo, String buscar) {
        return null;
    }

    @Override
    public void crear(String nombreArchivo) {
        File archivo=new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            System.out.println("Se creo el archivo correctamente");
        }catch(FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }

    }

    @Override
    public void borrar(String nombreArchivo) {

    }
}
