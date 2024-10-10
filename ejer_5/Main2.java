package ejer_5;


interface Movible {
    void moverse();
}


class Coche implements Movible {
    @Override
    public void moverse() {
        System.out.println("El coche se mueve sobre ruedas.");
    }
}

class Avion implements Movible {
    @Override
    public void moverse() {
        System.out.println("El avión vuela en el aire.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Movible coche = new Coche();
        Movible avion = new Avion();
        
        coche.moverse();
        avion.moverse();
    }
}
