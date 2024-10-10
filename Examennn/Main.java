package Examennn;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[2];
        empleados[0] = new EmpleadoTiempoCompleto("Juan", 45, 20, 100);
        empleados[1] = new EmpleadoPorComision("María", 15000, 0.1, 500);

        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre() + ", Salario: " + empleado.calcularSalario());
        }

        CuentaBancaria cuenta = new CuentaBancaria("123456", 1000);
        cuenta.depositar(500);
        try {
            cuenta.retirar(200);
            cuenta.retirar(1500); // Intento de retiro que debe fallar
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Historial de transacciones:");
        for (Transaccion t : cuenta.getHistorialTransacciones()) {
            System.out.println(t);
        }
        FiguraGeometrica[] figuras = {
            new Triangulo(5, 10),
            new Cuadrado(4),
            new Pentagono(3)
        };

        for (FiguraGeometrica figura : figuras) {
            System.out.println("Área: " + figura.calcularArea() + ", Perímetro: " + figura.calcularPerimetro());
        }
        Calculadora calculadora = new Calculadora();

        // Probar división
        try {
            System.out.println("División: " + calculadora.dividir(10, 2));
            System.out.println("División: " + calculadora.dividir(10, 0)); // Esto lanzará una excepción
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Probar raíz cuadrada
        try {
            System.out.println("Raíz cuadrada: " + calculadora.raizCuadrada(16));
            System.out.println("Raíz cuadrada: " + calculadora.raizCuadrada(-4)); // Esto lanzará una excepción
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Libro libro1 = new Libro("1984", "George Orwell", "123456789");
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "987654321");

        // Crear un estudiante
        Estudiante estudiante = new Estudiante("Ana", "E001");

        // Crear prestamo1 y prestamo2 como variables de instancia
        Prestamo prestamo1 = null;
        Prestamo prestamo2 = null;

        // Simular préstamos de libros
        if (libro1.isDisponible()) {
            prestamo1 = new Prestamo(libro1, new Date(), estudiante.getNombre());
            estudiante.agregarPrestamo(prestamo1);
            libro1.prestar();
        }

        if (libro2.isDisponible()) {
            prestamo2 = new Prestamo(libro2, new Date(), estudiante.getNombre());
            estudiante.agregarPrestamo(prestamo2);
            libro2.prestar();
        }

        // Mostrar préstamos del estudiante
        System.out.println("Préstamos de " + estudiante.getNombre() + ":");
        for (Prestamo p : estudiante.getPrestamos()) {
            System.out.println("Libro: " + p.getLibro().getTitulo() + ", Fecha de préstamo: " + p.getFechaPrestamo());
        }

        // Devolver un libro
        if (prestamo1 != null) {
            prestamo1.devolver(new Date());
            System.out.println("Libro " + prestamo1.getLibro().getTitulo() + " devuelto.");
        }
    }
    
}