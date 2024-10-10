package ejer9_10;


class Singleton {
    
    private static Singleton instancia;

    private Singleton() {
    }

    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton(); 
        }
        return instancia;
    }

    public void mostrarMensaje() {
        System.out.println("Hola, soy una instancia única!");
    }
}


