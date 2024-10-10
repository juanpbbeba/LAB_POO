package Examennn;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Clase Libro
class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void prestar() {
        this.disponible = false;
    }

    public void devolver() {
        this.disponible = true;
    }
}

// Clase Prestamo
class Prestamo {
    private Libro libro;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private String estudiante;

    public Prestamo(Libro libro, Date fechaPrestamo, String estudiante) {
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.estudiante = estudiante;
        this.fechaDevolucion = null; // Aún no devuelto
    }

    public void devolver(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
        libro.devolver(); // Marcar libro como disponible
    }

    public Libro getLibro() {
        return libro;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }
}

// Clase Estudiante
class Estudiante {
    private String nombre;
    private String codigo;
    private List<Prestamo> prestamos;

    public Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.prestamos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }
}

