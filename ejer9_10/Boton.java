package ejer9_10;

// Interfaz de producto
interface Boton {
    void dibujar();
}

// Implementaciones de producto
class BotonWindows implements Boton {
    public void dibujar() {
        System.out.println("Dibuja un botón en Windows.");
    }
}

class BotonMac implements Boton {
    public void dibujar() {
        System.out.println("Dibuja un botón en Mac.");
    }
}

// Interfaz de fábrica abstracta
interface GUIFactory {
    Boton crearBoton();
}

// Implementaciones de fábrica
class WindowsFactory implements GUIFactory {
    public Boton crearBoton() {
        return new BotonWindows();
    }
}

class MacFactory implements GUIFactory {
    public Boton crearBoton() {
        return new BotonMac();
    }
}

