/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Marcelo
 */
public abstract class Keyboard extends InputDevice{
    private final int id;
    private static int keyboardCounter;
    
    public Keyboard(String marca, String tipoEntrada) {
        super(marca, tipoEntrada);
        this.id= ++Keyboard.keyboardCounter;
    }

    @Override
    public String toString() {
        return "Raton{" + "id=" + id + ", contadorRatones=" + keyboardCounter + '}';
    }
}
