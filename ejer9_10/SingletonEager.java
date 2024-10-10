package ejer9_10;

class SingletonEager {
    private static final SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }

    public void mostrarMensaje() {
        System.out.println("Hola desde la instancia ansiosa!");
    }
}
    