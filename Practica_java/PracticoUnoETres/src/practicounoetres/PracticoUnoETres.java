package practicounoetres;

public class PracticoUnoETres {

    public static void main(String[] args) {
        CuentaBancaria cuenta=new CuentaBancaria("44985461", "Marcelo", 500);
        cuenta.verSaldo();
        cuenta.deposito(600);
        cuenta.verSaldo();
        cuenta.retiro(350.80);
        cuenta.verDatos();
    }
    
}
