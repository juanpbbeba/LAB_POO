package EJER_3;

public class Circulo {
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }


    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }


    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        System.out.println("Área del círculo: " + circulo.calcularArea());
    }
}
