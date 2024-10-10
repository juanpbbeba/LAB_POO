package ejer_4;

class Empleado1 {
    private String nombre;
    private double salario;

    
    public Empleado1(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    
    public double calcularBono() {
        return salario * 0.10; 
    }

    
    public String getInfo() {
        return "Nombre: " + nombre + ", Salario: " + salario + ", Bono: " + calcularBono();
    }
}


class Gerente extends Empleado1 {
    public Gerente(String nombre, double salario) {
        super(nombre, salario);
    }

    
    @Override
    public double calcularBono() {
        return super.calcularBono() + (super.calcularBono() * 0.05); 
    }
}


public class Main {
    public static void main(String[] args) {
        Empleado1 empleado = new Empleado1("Juan Pérez", 1000);
        Gerente gerente = new Gerente("María López", 1200);

        System.out.println(empleado.getInfo());
        System.out.println(gerente.getInfo());
    }
}
