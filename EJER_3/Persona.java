package EJER_3;


public class Persona {
    private String nombre;
    private int edad;
    private String correoElectronico;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }


    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan Pérez");
        persona.setEdad(30);
        persona.setCorreoElectronico("juan.perez@example.com");

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Correo: " + persona.getCorreoElectronico());
    }
}
