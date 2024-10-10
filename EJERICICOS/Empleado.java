package EJERICICOS;


public class Empleado {
    private String nombre;
    private double salario; 
    private String departamento;

 
    public Empleado(String nombre, double salario, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

   
    private double getSalario() {
        return salario;
    }
    public static void main(String[] args) {
        Empleado empleado = new Empleado("María López", 50000, "Finanzas");
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Departamento: " + empleado.getDepartamento());
        
    }
}
