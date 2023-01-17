package at.marlo.patterns.factory.beispiel;


import java.util.Random;

public class Factory {

    public static Actor getRandomActor() {
        Random random = new Random();
        int number = random.nextInt(3);

        if (number == 0) {
            return new Bee();
        }
        if (number == 1) {
            return new Ant();
        }

        return new Wolf();
    }

}
