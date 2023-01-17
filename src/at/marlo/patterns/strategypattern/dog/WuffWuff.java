package at.marlo.patterns.strategypattern.dog;

public class WuffWuff implements wufStrategy {


    @Override
    public void bell() {
        System.out.println("WuffWuff");
    }


}
