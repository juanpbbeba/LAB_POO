package ejer9_10;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstancia();
        singleton.mostrarMensaje(); 
    
        GUIFactory factory;
        String sistemaOperativo = "Windows"; 

        if (sistemaOperativo.equals("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }

        Boton boton = factory.crearBoton();
        boton.dibujar(); 
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);

        controlador.setMensaje("Hola MVC!");
        controlador.actualizarVista(); 
    }
}
