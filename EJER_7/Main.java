package EJER_7;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.saludar();

        Estudiante estudiante = new Estudiante("Ana");
        estudiante.saludar();
        estudiante.saludar("Juan");
        Coche coche = new Coche("Toyota", 4);
        System.out.println("Marca: " + coche.getMarca() + ", Puertas: " + coche.getNumeroPuertas());

        try {
            CuentaBancaria cuenta = new CuentaBancaria("001", 500);
            cuenta.retirar(600); // Esto debería lanzar una excepción
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        try {
            CuentaCorriente cuentaCorriente = new CuentaCorriente("002", 200, 100);
            cuentaCorriente.retirar(300); // Esto debería funcionar
            System.out.println("Retiro exitoso. Saldo restante: " + cuentaCorriente.getSaldo());
        } catch (SaldoInsuficienteException | LimiteSobregiroExcedidoException e) {
            System.out.println(e.getMessage());
        }
    }
}