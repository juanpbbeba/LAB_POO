package Examennn;


class Calculadora {
    public double dividir(int dividendo, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Error: No se puede dividir entre cero.");
        }
        return (double) dividendo / divisor;
    }

    public double raizCuadrada(int numero) throws IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException("Error: No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(numero);
    }
}


