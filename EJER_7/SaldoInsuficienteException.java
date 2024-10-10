package EJER_7;


class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}

class LimiteSobregiroExcedidoException extends Exception {
    public LimiteSobregiroExcedidoException(String mensaje) {
        super(mensaje);
    }
}

class CuentaBancaria {
    private double saldo;
    private String numeroCuenta;

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar el retiro.");
        }
        saldo -= cantidad;
    }

    public double getSaldo() {
        return saldo;
    }
}


class CuentaCorriente extends CuentaBancaria {
    private double limiteSobregiro;

    public CuentaCorriente(String numeroCuenta, double saldoInicial, double limiteSobregiro) {
        super(numeroCuenta, saldoInicial);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void retirar(double cantidad) throws SaldoInsuficienteException, LimiteSobregiroExcedidoException {
        if (cantidad > getSaldo() + limiteSobregiro) {
            throw new LimiteSobregiroExcedidoException("Límite de sobregiro excedido.");
        }
        super.retirar(cantidad);
    }
}



