package mx.com.gm.peliculas.datos;

import mx.com.gm.peliculas.domain.Pelicula;

import java.util.List;

public class AccesoDatosImpl implements AccesoDatos{
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

    }

    @Override
    public void borrar(String nombreArchivo) {

    }
}
