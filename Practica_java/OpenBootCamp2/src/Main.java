import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numeroIf,numeroWhile=0,estacion;

        numeroIf= sc.nextInt();
        estacion=sc.nextInt();
        if (numeroIf<0){
            System.out.println(numeroIf+" es menor");
        } else if (numeroIf>0) {
            System.out.println(numeroIf+" es mayor");
        }else{
            System.out.println(numeroIf+" es cero");
        }

        while (numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        }while (numeroWhile<3);

        for (int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }

        switch (estacion){
            case 1:
                System.out.println("verano");
                break;
            case 2:
                System.out.println("Otono");
                break;
            case 3:
                System.out.println("Invierno");
                break;
            case 4:
                System.out.println("Primavera");
                break;
            default:
                System.out.println("no se ingreso un valor valido");
                break;
        }
    }
}