/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preparcial;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 a) Crea una clase "Vehículo" que tenga como atributos la marca, el modelo, el año de fabricación, la velocidad actual y la velocidad máxima.
        b) Agrega los métodos necesarios para modificar y obtener estos atributos, así como para acelerar, frenar y mostrar la información
        * del vehículo (marca, modelo, año de fabricación, velocidad actual y velocidad máxima).
        c) Luego crea una clase "Coche" que herede de la clase "Vehículo" y tenga un atributo adicional para el número de puertas.
        d) Agrega los métodos necesarios para modificar y obtener este atributo, y sobrescribe el método de mostrar información para incluir 
        * también el número de puertas.
        e) Luego crea un objeto de tipo "Coche" e imprime su información por consola mientras realizas algunas operaciones de aceleración y frenado.
 */
public class Vehiculo {
    String marca;
    String modelo;
    int ano;
    long vMax;
    long vActual;
    private long vel;
    LocalDate fech;

    Scanner sc=new Scanner(System.in);
    public Vehiculo(){
        setMarca();
        setModelo();
        setFabricacion();
    }

    public void setMarca() {
        System.out.println("Ingrese la marca");
        marca=sc.next();
    }

    public void setModelo() {
        System.out.println("Ingrese el modelo");
        modelo=sc.next();
    }

    public void setFabricacion() {
        System.out.println("Ingrese el año de fabricacion");
        ano=sc.nextInt();
        fech=LocalDate.ofYearDay(ano, 1);
    }
    
    
    void acelerar(){
        do {        
            System.out.println("Ingrese cuantos km/h desea acelerar");
            vel=sc.nextLong();
            if (vel>0) {
            vActual+=vel;
            break;
            }else{
            System.out.println("no puede desacelerar con este metodo");
            }
            
        } while (true);
        if (vActual>vMax) {
            vMax=vActual;
        }
        System.out.println("La velocidad actual es: "+vActual);
    }
    
    void frenar(){
        vActual=0;
        System.out.println("el vehiculo se ha detenido");
    }
    
    void mostrarInfo(){
        System.out.println("Los datos del vehiculo son:"
                + "\nMarca: "+marca
                + "\nModelo: "+modelo
                + "\nAño de fabricacion: "+fech.getYear()
                + "\nVelocidad Maxima alcanzada: "+vMax
                + "\nVelocidad Actual: "+vActual);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAno() {
        return ""+fech.getYear();
    }

    public long getvActual() {
        return vActual;
    }
    
    public long getvMax() {
        return vMax;
    }

    public void setvMax(long vMax) {
        this.vMax = vMax;
    }

    public void setvActual(long vActual) {
        this.vActual = vActual;
    }
    
}
