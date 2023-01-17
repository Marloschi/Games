package at.marlo.patterns.factory.beispiel;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 20; i++) {
            Factory.getRandomActor().sayHello();
        }
    }
}
