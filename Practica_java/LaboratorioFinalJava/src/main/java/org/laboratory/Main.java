package org.laboratory;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.*;

public class Main {
    public static void main(String[] args) {
        boolean bol=true;
        Scanner sc=new Scanner(System.in);
        int opcion;
        CatalagoPeliculas catalogoPeliculas;
        String nombreArchivo;
        do {
            System.out.println("elige opcion:" +
                    "1.-Iniciar catalogo peliculas" +
                    "2.-Agregar pelicula" +
                    "3.Listar Peliculas" +
                    "4.-Buscar pelicula" +
                    "0.-Salir");
            opcion=sc.nextInt();
        switch (opcion){
            case 0:
                bol=false;
                break;
            case 1:

                break;
            default:
                System.out.println("No ingreso una opcion valida");
                break;
        }
        }while (bol);
    }
}