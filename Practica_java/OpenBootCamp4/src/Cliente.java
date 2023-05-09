public class Cliente extends Persona{
    private double credito;
    public Cliente(String nombre, String telefono, int edad,double credito) {
        super(nombre, telefono, edad);
        this.credito=credito;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "credito=" + credito +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                '}';
    }
}
