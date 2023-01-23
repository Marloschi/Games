package at.marlo.patterns.factory.beispiel;

public class Ant extends AbstractActor {
    public Ant(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Ant: " + name);
    }
}
