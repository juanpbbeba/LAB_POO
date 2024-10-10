package ejer_5;


abstract class Forma {
    public abstract double calcularArea();
}


class Triangulo extends Forma {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

class Cuadrado extends Forma {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}


public class Main {
    public static void main(String[] args) {
        Forma triangulo = new Triangulo(5, 10);
        Forma cuadrado = new Cuadrado(4);
        
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
    }
}
