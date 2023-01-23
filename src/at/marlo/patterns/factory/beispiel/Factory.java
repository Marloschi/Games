package at.marlo.patterns.factory.beispiel;


import java.util.Random;

public class Factory {

    public static Actor getRandomActor() {
        Random random = new Random();
        int number = random.nextInt(3);

        if (number == 0) {
            return new Bee("Dafid " + random.nextInt(999));
        }
        if (number == 1) {
            return new Ant("Floflo " + random.nextInt(999));
        }

        return new Wolf("Wolfi " + random.nextInt(999));
    }

}
