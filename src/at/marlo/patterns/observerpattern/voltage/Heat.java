package at.marlo.patterns.observerpattern.voltage;

public class Heat implements Observer {
    @Override
    public void inform() {
        System.out.println("heat was informed");
    }
}
