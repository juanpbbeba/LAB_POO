package Examennn;

// Clase base abstracta Empleado
abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSalario();

    public String getNombre() {
        return nombre;
    }
}

// Subclase EmpleadoTiempoCompleto
class EmpleadoTiempoCompleto extends Empleado {
    private double horasTrabajadas;
    private double tarifaPorHora;
    private double bonoExtra;

    public EmpleadoTiempoCompleto(String nombre, double horasTrabajadas, double tarifaPorHora, double bonoExtra) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
        this.bonoExtra = bonoExtra;
    }

    @Override
    public double calcularSalario() {
        double salarioBase = horasTrabajadas * tarifaPorHora;
        if (horasTrabajadas > 40) {
            salarioBase += bonoExtra;
        }
        return salarioBase;
    }
}

// Subclase EmpleadoPorComision
class EmpleadoPorComision extends Empleado {
    private double ventasTotales;
    private double porcentajeComision;
    private double bonoMeta;

    public EmpleadoPorComision(String nombre, double ventasTotales, double porcentajeComision, double bonoMeta) {
        super(nombre);
        this.ventasTotales = ventasTotales;
        this.porcentajeComision = porcentajeComision;
        this.bonoMeta = bonoMeta;
    }

    @Override
    public double calcularSalario() {
        double salarioBase = ventasTotales * porcentajeComision;
        if (ventasTotales > 10000) {
            salarioBase += bonoMeta;
        }
        return salarioBase;
    }
}



