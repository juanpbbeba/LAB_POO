package EJER_7;

// Clase base Persona
class Persona {
    public void saludar() {
        System.out.println("¡Hola! Soy una persona.");
    }
}

// Clase derivada Estudiante
class Estudiante extends Persona {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void saludar() {
        System.out.println("¡Hola! Soy " + nombre + ".");
    }

    // Sobrecarga del método saludar
    public void saludar(String otraPersona) {
        System.out.println("¡Hola " + otraPersona + "! Soy " + nombre + ".");
    }
}


