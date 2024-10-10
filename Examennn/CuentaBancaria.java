package Examennn;

import java.util.ArrayList;
import java.util.List;


class Transaccion {
    private String tipo;
    private double monto;
    private String fechaHora;

    public Transaccion(String tipo, double monto, String fechaHora) {
        this.tipo = tipo;
        this.monto = monto;
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        return tipo + ": " + monto + " - " + fechaHora;
    }
}


class CuentaBancaria {
    private final String numeroCuenta;
    private double saldo;
    private List<Transaccion> historialTransacciones;

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.historialTransacciones = new ArrayList<>();
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        historialTransacciones.add(new Transaccion("Depósito", cantidad, java.time.LocalDateTime.now().toString()));
    }

    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para retirar " + cantidad);
        }
        saldo -= cantidad;
        historialTransacciones.add(new Transaccion("Retiro", cantidad, java.time.LocalDateTime.now().toString()));
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Transaccion> getHistorialTransacciones() {
        return new ArrayList<>(historialTransacciones); 
    }
}




