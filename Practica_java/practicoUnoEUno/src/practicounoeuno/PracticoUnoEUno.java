package practicounoeuno;

public class PracticoUnoEUno {

    public static void main(String[] args) {
    /*  Instancio el objeto "person" proveniente de la clase "Persona", elegi
        utilizar un constructor con los parametros para agilizar la presentacion
        de este trabajo , pero podria instanciarse sin parametros, ya que ambos
        constructores estan definidos                                           */
        Persona person=new Persona(20, "Marcelo", 1);
        System.out.println("Los datos de la persona son los siguientes:"
                + "\nNombre: "+person.getNombre()
                + "\nEdad: "+person.getEdad()
                + "\nGenero: "+person.getGenero());
        
        /*Utilizo los metodos "sets" para modificar los datos dentro del objeto
        person*/
        person.setEdad(19);
        person.setNombre("Lucia");
        person.setGenero(2);
        /*
        Utilizo los metodos de get para imprimir los datos 
        */
        System.out.println("---------------------------------------");
        System.out.println("Los datos de la persona son los siguientes:"
                            + "\nNombre: "+person.getNombre()
                            + "\nEdad: "+person.getEdad()
                            + "\nGenero: "+person.getGenero());  
    }
}
