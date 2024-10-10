package ejer_4;


class Vehiculo {
    protected String marca;
    protected String modelo;


    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getInfo() {
        return "Marca: " + marca + ", Modelo: " + modelo;
    }
}

class VehiculoMotorizado extends Vehiculo {
    protected int potencia;

    public VehiculoMotorizado(String marca, String modelo, int potencia) {
        super(marca, modelo);
        this.potencia = potencia;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Potencia: " + potencia + " HP";
    }
}

class Coche extends VehiculoMotorizado {
    private int puertas;

    public Coche(String marca, String modelo, int potencia, int puertas) {
        super(marca, modelo, potencia);
        this.puertas = puertas;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Puertas: " + puertas;
    }
}


class Motocicleta extends VehiculoMotorizado {
    private boolean tieneSidecar;

    public Motocicleta(String marca, String modelo, int potencia, boolean tieneSidecar) {
        super(marca, modelo, potencia);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Tiene Sidecar: " + (tieneSidecar ? "Sí" : "No");
    }
}


public class Main2 {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 130, 4);
        Motocicleta moto = new Motocicleta("Harley-Davidson", "Street 750", 75, false);

        System.out.println(coche.getInfo());
        System.out.println(moto.getInfo());
    }
}
