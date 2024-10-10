package ejer9_10;


class Modelo {
    private String mensaje;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}


class Vista {
    public void mostrarMensaje(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }
}


class Controlador {
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void actualizarVista() {
        vista.mostrarMensaje(modelo.getMensaje());
    }

    public void setMensaje(String mensaje) {
        modelo.setMensaje(mensaje);
    }
}



