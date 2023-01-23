package at.marlo.patterns.factory.beispiel;

public class Wolf extends AbstractActor {
    public Wolf(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Wolf: " + name);
    }
}
