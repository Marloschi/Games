package at.marlo.patterns.strategy.dog;

public abstract class AbstractDog implements Dog {

    protected String name;
    protected String bDate;
    protected wufStrategy wufStrategy;

    public AbstractDog(wufStrategy wufStrategy) {
        this.wufStrategy = wufStrategy;
    }
}
