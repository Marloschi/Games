package at.marlo.patterns.observerpattern.voltage;

import java.util.ArrayList;
import java.util.List;

public class Sonnenkollektor {
    private float currentVoltage;
    private List<Observer> observers;

    public Sonnenkollektor(float currentVoltage) {
        this.observers = new ArrayList<>();
        this.currentVoltage = currentVoltage;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void inform() {
        if (currentVoltage >= 18.0f) {
            for (Observer observer : observers
            ) {
                observer.inform();
            }
        }
    }

}
