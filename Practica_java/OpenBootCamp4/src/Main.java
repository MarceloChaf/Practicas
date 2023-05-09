public class Main {
    public static void main(String[] args) {

        Cliente cl=new Cliente("Alejandro","55687954",20,5000);
        System.out.println(cl.toString());
        Trabajador tr=new Trabajador("Marcelo","5568954",25,10000);
        System.out.println(tr.toString());
    }
}