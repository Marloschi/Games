package at.marlo.patterns.observerpattern.voltage;

public class Dishwasher implements Observer {
    
    @Override
    public void inform() {
        System.out.println("Dishwasher was informed");
    }
}
