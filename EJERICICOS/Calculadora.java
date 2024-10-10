package EJERICICOS;


public class Calculadora {
    
    public double suma(double a, double b) {
        return a + b;
    }

  
    public double resta(double a, double b) {
        return a - b;
    }

    public double multiplicacion(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN; 
        }
        return a / b;
    }
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Suma: " + calc.suma(5, 3));
        System.out.println("Resta: " + calc.resta(5, 3));
        System.out.println("Multiplicación: " + calc.multiplicacion(5, 3));
        System.out.println("División: " + calc.division(5, 0)); // División por cero
        System.out.println("División: " + calc.division(6, 2));
    }

}
