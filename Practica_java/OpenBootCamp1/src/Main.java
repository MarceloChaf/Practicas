// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static int sumar(int a , int b , int c){
        return (a+b+c);
    }

    public static void main(String[] args) {
        int n1=5 ,n2=6, n3=8;
        System.out.println("la suma de los 3 numeros designados es: "+ sumar(n1,n2,n3));

        Coche miCoche=new Coche();
        miCoche.sumarPuertas();
        System.out.println("El numero de puertas del coche es: "+ miCoche.getPuertas());
    }
}