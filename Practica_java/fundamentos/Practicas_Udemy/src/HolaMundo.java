
import java.util.Scanner;

// documentacion
public class HolaMundo {
    public static void main (String args[]){
        
        System.out.println ("hola mundo desde Java");
        int  entero= 15;
        System.out.println (entero);
        System.out.println(entero+entero);
       var perro="hola perro";
        System.out.println(perro);
        boolean comprobador=true;
        var avion=0.5;
        double av=0.56;
        float perrosalvaje= (float) 5.34;
        System.out.println(perrosalvaje*avion*av);
        System.out.println("perrosalvaje = " + perrosalvaje);
        while (comprobador) {
            System.out.println("Ingrese el numero que desea multiplicar por si mismo");
            Scanner input = new Scanner(System.in);
            var entrada="perro";
            try {
                entrada  = Integer.parseInt(input.nextLine());
                System.out.println("ingrese el segundo valor");
                perro=(input.nextLine());
                System.out.println(Integer.parseInt(perro)*entrada);
                comprobador=false;
            } catch (Exception e) {
                System.out.println("parece que hubo un error al ingresar los datos , por favor revise que todas las variables sean int");
                System.out.println(entrada.getClass);
            }            
            
        }


        
      }
    
}
