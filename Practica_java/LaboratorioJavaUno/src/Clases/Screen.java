/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Marcelo
 */
public class Screen {
    private final int id;
    private String brand;
    private double tamaño;
    static int contadorMonitores;

    public Screen() {
        this.id=++Screen.contadorMonitores;
        
    }

    public Screen(String brand, double tamaño) {
        this.brand = brand;
        this.tamaño = tamaño;
        this.id=++Screen.contadorMonitores;
    }

    @Override
    public String toString() {
        return "Screen{" + "id=" + id + ", brand=" + brand + ", tama\u00f1o=" + tamaño + '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }
    
    
}
