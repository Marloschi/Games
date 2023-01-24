package at.marlo.patterns.singleton;

public class Main {
    public static void main(String[] args) {
        CounterSingleton cs1 = CounterSingleton.getInstance();
        CounterSingleton cs2 = CounterSingleton.getInstance();
        CounterSingleton cs3 = CounterSingleton.getInstance();

        cs1.increaseCounter();
        cs2.increaseCounter();
        cs3.increaseCounter();

        System.out.println(cs1.getCounter());
        System.out.println(cs2.getCounter());
        System.out.println(cs3.getCounter());
    }
}
