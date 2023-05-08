/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Marcelo
 */
public abstract class InputDevice{
    
    protected String inputType,brand;
    
    public InputDevice(String brand, String inputType){
        this.brand=brand;
        this.inputType=inputType;    
    }

    public String getTipoEntrada() {
        return inputType;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.inputType = tipoEntrada;
    }

    public String getMarca() {
        return brand;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipoEntrada=" + inputType + ", marca=" + brand + '}';
    }

    public void setMarca(String marca) {
        this.brand = marca;
    }
    
    
}
