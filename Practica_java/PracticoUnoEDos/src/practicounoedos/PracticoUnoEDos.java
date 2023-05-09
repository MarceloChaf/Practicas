package practicounoedos;

public class PracticoUnoEDos {


    public static void main(String[] args) {
        Rectangulo figura=new Rectangulo(2, 5);
        System.out.println("El area del rectangulo es: "+figura.ObtenerArea());
        System.out.println("El perimetro del rectangulo es: "+figura.ObtenerPerimetro());
    }
    
}
