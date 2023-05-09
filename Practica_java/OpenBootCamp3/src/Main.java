public class Main {
    public static void main(String[] args)
    {
        Persona person=new Persona();
        person.setNombre("Marcelo");
        person.setEdad(20);
        person.setTelefono("1545986545");
        System.out.println( "Persona{" +
                "edad=" + person.getEdad() +
                ", nombre='" + person.getNombre() + '\'' +
                ", telefono='" +person.getTelefono()+ '\'');
    }
}