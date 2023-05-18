package mx.com.gm.peliculas.negocio;

import mx.com.gm.peliculas.datos.AccesoDatos;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

import java.util.List;

public interface CatalagoPeliculas  {
    String Nombre_recurso="peliculas.txt";

    void agregarPelicula(String nombrerePelicula);
    void listarPelicular();
    void buscar(String vuscar);
    void iniciarCatalogPeliculas();
}

