package at.marlo.patterns.observer.voltage;

public class Heat implements Observer {
    @Override
    public void inform() {
        System.out.println("heat was informed");
    }
}
