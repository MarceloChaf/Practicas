/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preparcial;

import java.time.LocalDate;

/**
 a) Crea una clase "Vehículo" que tenga como atributos la marca, el modelo, el año de fabricación, la velocidad actual y la velocidad máxima.
        b) Agrega los métodos necesarios para modificar y obtener estos atributos, así como para acelerar, frenar y mostrar la información
        * del vehículo (marca, modelo, año de fabricación, velocidad actual y velocidad máxima).
        c) Luego crea una clase "Coche" que herede de la clase "Vehículo" y tenga un atributo adicional para el número de puertas.
        d) Agrega los métodos necesarios para modificar y obtener este atributo, y sobrescribe el método de mostrar información para incluir 
        * también el número de puertas.
        e) Luego crea un objeto de tipo "Coche" e imprime su información por consola mientras realizas algunas operaciones de aceleración y frenado.
 */
public class Coche extends Vehiculo{
    private int nPuertas;
    
    public Coche(){
        setPuertas();    
    }
    public void setPuertas(){
        System.out.println("Ingrese el numero de puertas");
        nPuertas=sc.nextInt();
    }
    
    public int getPuertas(){
        return nPuertas;
    }
    
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("El numero de puertas es: "+nPuertas);
    }
}
