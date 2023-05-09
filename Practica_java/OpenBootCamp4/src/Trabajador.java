public class Trabajador extends Persona{
    private double salario;

    public Trabajador(String nombre, String telefono, int edad,double salario) {
        super(nombre, telefono, edad);
        this.salario=salario;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "salario=" + salario +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                '}';
    }
}
