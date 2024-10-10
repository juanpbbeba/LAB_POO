package ejer_5;

class Vehiculo {
    protected String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }
}


class Coche extends Vehiculo {
    private int puertas;

    public Coche(String marca, int puertas) {
        super(marca); 
        this.puertas = puertas;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Puertas: " + puertas);
    }
}


public class Main4 {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", 4);
        coche.mostrarInfo();
    }
}
