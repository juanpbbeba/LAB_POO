package EJERICICOS;


public class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    private double saldo;

    
    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

   
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que cero.");
        }
    }


    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else if (cantidad > saldo) {
            System.out.println("Error: saldo insuficiente.");
        } else {
            System.out.println("La cantidad a retirar debe ser mayor que cero.");
        }
    }

    
    public double consultarSaldo() {
        return saldo;
    }
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", "123456", 1000.0);
        cuenta.depositar(200);
        cuenta.retirar(150);
        System.out.println("Saldo actual: " + cuenta.consultarSaldo());
        cuenta.retirar(1200);
    }

}
