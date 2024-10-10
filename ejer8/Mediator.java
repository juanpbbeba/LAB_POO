package ejer8;

// Interfaz del Mediator
interface Mediator {
    void notify(Colleague colleague, String event);
}

// Clase Colleague
abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}

// Clase concreta Colleague
class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void action() {
        System.out.println("Acción de Colleague1");
        mediator.notify(this, "action");
    }
}

class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void action() {
        System.out.println("Acción de Colleague2");
        mediator.notify(this, "action");
    }
}

// Implementación del Mediator
class ConcreteMediator implements Mediator {
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void notify(Colleague colleague, String event) {
        if (colleague == colleague1) {
            System.out.println("Mediator notificado de la acción de Colleague1");
        } else if (colleague == colleague2) {
            System.out.println("Mediator notificado de la acción de Colleague2");
        }
    }
}


