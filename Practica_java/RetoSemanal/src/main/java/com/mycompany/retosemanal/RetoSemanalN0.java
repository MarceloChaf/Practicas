/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.retosemanal;


/**
 *
 * @author marcelo
 */

/*
  Reto #0
  EL FAMOSO "FIZZ BUZZ"
  Dificultad: FÁCIL
  Enunciado: Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos 
  y con un salto de línea entre cada impresión), sustituyendo los siguientes:
  - Múltiplos de 3 por la palabra "fizz".
  - Múltiplos de 5 por la palabra "buzz".
  - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 
  Información adicional:
  - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
  - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
  - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
  - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 
 */
public class RetoSemanalN0 {

    public static void main(String[] args) {
        
        int numero;
        
        for (int i = 1; i < 100; i++) {
            numero= i;
            if (numero%3==0 && numero%5==0) {
                System.out.println("FizzBuzz");
            } else {
                if (numero%5==0) {
                    System.out.println("Buzz");
                }else{
                    if (numero%3==0 ) {
                        System.out.println("Fizz");
                    }
                }
            }
        }
    }
}
