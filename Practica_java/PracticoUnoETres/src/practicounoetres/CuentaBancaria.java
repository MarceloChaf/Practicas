package practicounoetres;




public class CuentaBancaria {
    private String nCuenta,titular;
    private double saldo;


    public CuentaBancaria(String nCuenta, String titular, double saldo) {
        this.nCuenta = nCuenta;
        this.titular = titular;
        this.saldo = saldo;
        if (this.saldo<0) {
            this.saldo=0;
        }
    }
    
    public void deposito(double saldo){
        this.saldo+=saldo;      
}
    
    public void verSaldo() {
        System.out.println("El saldo actual es: $"+saldo);
    }
    
    public void verDatos(){
        System.out.println("los datos de la cuenta son:"
                + "\nNumero de cuenta:"+nCuenta
                + "\nNombre de titular: "+titular
                + "\nSaldo:$"+saldo);
    }
    public void retiro(double saldo){
        if (saldo<this.saldo) {
            this.saldo-=saldo;
            System.out.println("Se retiro $"+saldo);
        }else{
            System.out.println("no se puede retirar la cantidad ingresada");
        }
}
    
}
