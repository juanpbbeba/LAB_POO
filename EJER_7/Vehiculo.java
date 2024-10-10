package EJER_7;


class Vehiculo {
    protected String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
}


class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String marca, int numeroPuertas) {
        super(marca); 
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
}

