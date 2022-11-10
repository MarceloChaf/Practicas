
import java.util.Scanner;

// documentacion
public class HolaMundo {
    public static void main (String args[]){
        
        System.out.println ("hola mundo desde Java");
        int  entero= 15;
        System.out.println (entero);
        System.out.println(entero+entero);
        String perro="hola perro";
        System.out.println(perro);
        
        var avion=0.5;
        double av=0.56;
        float perrosalvaje= (float) 5.34;
        System.out.println(perrosalvaje*avion*av);
        System.out.println("perrosalvaje = " + perrosalvaje);
        
        System.out.println("Ingrese el numero que desea multiplicar por si mismo");
        Scanner input = new Scanner(System.in);
        var entrada  = input.nextLine();
        System.out.println(entrada+entrada);
        
      }
    
}
