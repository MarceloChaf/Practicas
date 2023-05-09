package practicounoeuno;

/**
 * @author Marcelo
 */
public class Persona {
    
    private int edad,gen;
    private String nombre,genero;

    public Persona() {
    }

    public Persona(int edad, String nombre, int gen) {
        this.edad = edad;
        this.nombre = nombre;
        switch (gen) {
            case 1 -> {
                genero="Varon";
            }
            case 2 -> {
                genero="Mujer";
            }
            case 3 -> {
                genero="Otro";
            }
            default -> throw new AssertionError("Genero invalido");
        }             
    }
      
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(int gen) {
        switch (gen) {
            case 1 -> {
                genero="Varon";
            }
            case 2 -> {
                genero="Mujer";
            }
            case 3 -> {
                genero="Otro";
            }
            default -> throw new AssertionError("Genero invalido");
        }
    } 
}
