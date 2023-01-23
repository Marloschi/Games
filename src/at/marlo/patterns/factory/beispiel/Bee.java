package at.marlo.patterns.factory.beispiel;

public class Bee extends AbstractActor {


    public Bee(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Bee: " + name);

    }
}
