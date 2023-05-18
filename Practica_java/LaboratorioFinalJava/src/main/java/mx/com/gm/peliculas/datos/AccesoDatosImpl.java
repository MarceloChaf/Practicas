package mx.com.gm.peliculas.datos;

import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.EscrituraDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatosImpl implements AccesoDatos{

    @Override
    public boolean Existe(String nombreArchivo) {
        var archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
        var archivo = new File(nombreArchivo);
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea=entrada.readLine();
            while (linea!=null){
                Pelicula pelicula= new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();
                entrada.close();
            }
        } catch (IOException ex){
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar peliculas: "+ ex.getMessage());
        }
        return null;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombre, boolean anexar) throws EscrituraDatosEx {
        var archivo=new File(nombre);
        try{
            var salida=new PrintWriter(new FileWriter(archivo,anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("Se ha escrito informacion en el archivo");
        }catch (IOException ex){
            ex.printStackTrace();
            throw new EscrituraDatosEx("Excepcion al escribir peliculas: "+ ex.getMessage());
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
        var archivo=new File(nombreArchivo);
        String resultado=null;
        try {
            var entrada = new BufferedReader(new FileReader(nombreArchivo));
            String linea=null;
            linea=entrada.readLine();
            int indice=1;
            while (linea!=null){
                if (buscar!=null && buscar.equalsIgnoreCase(linea)){
                    resultado="Pelicula "+ linea + " encontrada en el indice "+ indice;
                    break;
                }
                linea=entrada.readLine();
                indice++;
            }
        } catch (IOException ex){
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al buscar peliculas: "+ ex.getMessage());
        }
        return null;
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
        var archivo=new File(nombreArchivo);
        try{
            var salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");
        }catch (IOException ex){
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al crear archivos: "+ ex.getMessage());
        }

    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {
        var archivo=new File(nombreArchivo);
        if (archivo.exists()){
            archivo.delete();
            System.out.println("Se ha borrado el archivo");
        }else {
            System.out.println("Se ha borrado el archivo");
        }

    }
}
