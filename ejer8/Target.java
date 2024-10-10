package ejer8;


interface Target {
    void request();
}


class Adaptee {
    void specificRequest() {
        System.out.println("Solicitud específica.");
    }
}


class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}


