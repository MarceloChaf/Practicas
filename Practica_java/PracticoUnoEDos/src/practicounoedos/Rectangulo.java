/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicounoedos;

/**
 *
 * @author Marcelo
 */
public class Rectangulo {
    private double base,altura;

    public Rectangulo(double base,double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double ObtenerArea(){
    return base*altura;
    }
    
    public double ObtenerPerimetro(){
    return 2*(base+altura);
    }
}
