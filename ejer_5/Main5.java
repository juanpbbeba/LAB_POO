package ejer_5;


class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}


class LimiteSobregiroExcedidoException extends Exception {
    public LimiteSobregiroExcedidoException(String message) {
        super(message);
    }
}

class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para retirar " + cantidad);
        }
        saldo -= cantidad;
    }
}


class CuentaCorriente extends CuentaBancaria {
    private double limiteSobregiro;

    public CuentaCorriente(double saldoInicial, double limiteSobregiro) {
        super(saldoInicial);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void retirar(double cantidad) throws SaldoInsuficienteException, LimiteSobregiroExcedidoException {
        if (cantidad > (saldo + limiteSobregiro)) {
            throw new LimiteSobregiroExcedidoException("Límite de sobregiro excedido al intentar retirar " + cantidad);
        }
        saldo -= cantidad;
    }
}


public class Main5 {
    public static void main(String[] args) {
        try {
            CuentaBancaria cuenta = new CuentaBancaria(500);
            cuenta.retirar(600); // Esto lanzará una excepción

            CuentaCorriente cuentaCorriente = new CuentaCorriente(500, 200);
            cuentaCorriente.retirar(600); // Esto no lanzará excepción
            System.out.println("Retiro exitoso en cuenta corriente.");
        } catch (SaldoInsuficienteException | LimiteSobregiroExcedidoException e) {
            System.out.println(e.getMessage());
        }
    }
}

