package mx.com.gm.peliculas.negocio;

import mx.com.gm.peliculas.datos.AccesoDatos;
import mx.com.gm.peliculas.datos.AccesoDatosImpl;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;

public class CatalagoPeliculasImpl implements CatalagoPeliculas {
    private final AccesoDatos datos;
    public CatalagoPeliculasImpl() {
        this.datos=new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrerePelicula) {
        Pelicula pelicula=new Pelicula(nombrerePelicula);
        boolean anexar=false;
        try {
            anexar= datos.Existe(Nombre_recurso);
        }catch (AccesoDatosEx ex){
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }

    }

    @Override
    public void listarPelicular() {

    }

    @Override
    public void buscar(String vuscar) {

    }

    @Override
    public void iniciarCatalogPeliculas() {

    }
}
