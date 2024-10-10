package ejer_5;


class Persona {
    public void saludar() {
        System.out.println("Hola, soy una persona.");
    }
}


class Estudiante extends Persona {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y soy estudiante.");
    }


    public void saludar(String otraPersona) {
        System.out.println("Hola " + otraPersona + ", soy " + nombre + " y soy estudiante.");
    }
}


public class Main3 {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan");
        estudiante.saludar();
        estudiante.saludar("María");
    }
}
