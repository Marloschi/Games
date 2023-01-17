package at.marlo.patterns.strategypattern.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public abstract class AbstractActor implements Actor {
    protected final MoveStrategy moveStrategy;

    public AbstractActor(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    @Override
    public void render(Graphics graphics) {

    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        moveStrategy.update(delta);

    }
}
