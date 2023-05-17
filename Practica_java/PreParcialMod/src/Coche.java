public class Coche extends Vehiculo{
    int nPuertas;

    public Coche(String marca, String modelo) {
        super(marca, modelo);
        setPuertas();
    }

    public void setPuertas(){
        System.out.println("Ingrese el numero de puertas");
        this.nPuertas=sc.nextInt();
    }

    public int getPuertas(){
        return nPuertas;
    }

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("El numero de puertas es: "+nPuertas);
    }
}
