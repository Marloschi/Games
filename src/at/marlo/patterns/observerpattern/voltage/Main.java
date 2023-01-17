package at.marlo.patterns.observerpattern.voltage;

public class Main {
    public static void main(String[] args) {
        Sonnenkollektor s1 = new Sonnenkollektor(20);
        Sonnenkollektor s2 = new Sonnenkollektor(18);
        Heat h1 = new Heat();
        Dishwasher d1 = new Dishwasher();
        s1.addObserver(d1);
        s2.addObserver(h1);
        s1.inform();
        s2.inform();

    }
}
