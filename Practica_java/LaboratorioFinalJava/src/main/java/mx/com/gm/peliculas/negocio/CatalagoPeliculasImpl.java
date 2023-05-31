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
            datos.escribir(pelicula , Nombre_recurso, anexar);
        }catch (AccesoDatosEx ex){
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }

    }

    @Override
    public void listarPelicular() {
        try{
            var peliculas=this.datos.listar(Nombre_recurso);
            for (pelicula : peliculas ) {

            }
        }catch (AccesoDatosEx ex){
            System.out.println("error en el acceso a datos");
            ex.printStackTrace();
        }

    }

    @Override
    public void buscar(String vuscar) {
        String resultado=null;
        try{
            var peliculas=this.datos.listar(Nombre_recurso);
            for (pelicula : peliculas ) {

            }
        }catch (AccesoDatosEx ex){
            System.out.println("error en el acceso a datos");
            ex.printStackTrace();
        }
    }

    @Override
    public void iniciarCatalogPeliculas() {

    }
}
