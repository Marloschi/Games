package at.marlo.patterns.observer.voltage;

public class Dishwasher implements Observer {

    @Override
    public void inform() {
        System.out.println("Dishwasher was informed");
    }
}
