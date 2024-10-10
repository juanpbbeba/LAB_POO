package Examennn;

interface FiguraGeometrica {
    double calcularArea();
    double calcularPerimetro();
}


abstract class FiguraConLados implements FiguraGeometrica {
    protected int numLados;

    protected FiguraConLados(int numLados) {
        this.numLados = numLados;
    }
}


class Triangulo extends FiguraConLados {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        super(3);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {

        return base * 3;
    }
}


class Cuadrado extends FiguraConLados {
    private double lado;

    public Cuadrado(double lado) {
        super(4);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }
}


class Pentagono extends FiguraConLados {
    private double lado;

    public Pentagono(double lado) {
        super(5);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * lado * lado) / 4;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 5;
    }
}



