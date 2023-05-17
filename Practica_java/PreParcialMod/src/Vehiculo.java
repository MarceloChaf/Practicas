import java.util.Scanner;

public abstract class Vehiculo {
    protected String marca,modelo;
    protected long vMax,vActual,vel;
    protected String hora,fecha;


    Scanner sc=new Scanner(System.in);

    public Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        setFabricacion();
    }

    public void setMarca() {
        System.out.println("Ingrese la marca");
        marca=sc.next();
    }

    public void setModelo() {
        System.out.println("Ingrese el modelo");
        modelo=sc.next();
    }

    public void setFabricacion() {
        fecha=Tiempo.setFecha();
        hora=Tiempo.setHorario();
    }




    void acelerar(){
        do {
            System.out.println("Ingrese cuantos km/h desea acelerar");
            vel=sc.nextLong();
            if (vel>0) {
                vActual+=vel;
                break;
            }else{
                System.out.println("no puede desacelerar con este metodo");
            }

        } while (true);
        if (vActual>vMax) {
            vMax=vActual;
        }
        System.out.println("La velocidad actual es: "+vActual);
    }

    void frenar(){
        vActual=0;
        System.out.println("el vehiculo se ha detenido");
    }

    void mostrarInfo(){
        System.out.println("Los datos del vehiculo son:"
                + "\nMarca: "+marca
                + "\nModelo: "+modelo
                + "\nFecha de fabricación: "+fecha
                + "\nHora de fabricación: "+hora
                + "\nVelocidad Maxima alcanzada: "+vMax
                + "\nVelocidad Actual: "+vActual);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAno() {
        return "";
    }

    public long getvActual() {
        return vActual;
    }

    public long getvMax() {
        return vMax;
    }

    public void setvMax(long vMax) {
        this.vMax = vMax;
    }

    public void setvActual(long vActual) {
        this.vActual = vActual;
    }
}
