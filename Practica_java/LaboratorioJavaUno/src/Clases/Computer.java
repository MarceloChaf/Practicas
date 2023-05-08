/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Marcelo
 */
public class Computer {
    
    final int id;
    private String name;
    private Keyboard keyboard;
    private Mouse mouse;
    private Screen screen;
    static int computerCounter;

    public Computer() {
        this.id=++Computer.computerCounter;
    }

    public Computer(String name, Keyboard keyboard, Mouse mouse) {
        this.id=++Computer.computerCounter;
        this.name = name;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Computer{" + "id=" + id + ", name=" + name + ", keyboard=" + keyboard + ", mouse=" + mouse + ", screen=" + screen + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public static int getComputerCounter() {
        return computerCounter;
    }

    public static void setComputerCounter(int computerCounter) {
        Computer.computerCounter = computerCounter;
    }
    
}
