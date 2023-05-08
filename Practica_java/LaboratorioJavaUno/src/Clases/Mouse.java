/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Marcelo
 */
public class Mouse extends InputDevice {
    private final int id;
    private static int mouseCounter;
    
    public Mouse(String marca, String tipoEntrada) {
        super(marca, tipoEntrada);
        this.id= ++Mouse.mouseCounter;
    }

    @Override
    public String toString() {
        return "Raton{" + "id=" + id + ", contadorRatones=" + mouseCounter + '}';
    }
    
}
