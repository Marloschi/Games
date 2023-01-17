package at.marlo.patterns.strategypattern.dog;

public class Boxer extends AbstractDog {


    public Boxer(wufStrategy wufStrategy) {
        super(wufStrategy);
    }

    @Override
    public void run() {
        System.out.println("Hallo Boxer");
        this.wufStrategy.bell();

    }
}
