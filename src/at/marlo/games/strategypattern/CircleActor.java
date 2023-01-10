package at.marlo.games.strategypattern;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CircleActor implements Actor {
    private final MoveStrategy moveStrategy;

    public CircleActor(MoveStrategy moveStrategy) {
        super();
        this.moveStrategy = moveStrategy;
    }


    @Override
    public void render(Graphics graphics) {

        graphics.drawOval(this.moveStrategy.getX(), this.moveStrategy.getY(), 80, 80);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        this.moveStrategy.update(delta);
    }
}
