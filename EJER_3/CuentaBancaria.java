package EJER_3;


public class CuentaBancaria {
    public String numeroCuenta;
    private double saldo;
    protected String titular;

    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
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

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456", "Juan Pérez", 1000.0);
        cuenta.depositar(200);
        cuenta.retirar(150);
        cuenta.retirar(1200); 
    }
}
