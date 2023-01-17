package at.marlo.patterns.strategypattern.wintergame;

import org.newdawn.slick.Graphics;

public class RectangleActor extends AbstractActor {

    public RectangleActor(MoveStrategy moveStrategy) {
        super(moveStrategy);
    }

    @Override
    public void render(Graphics graphics) {

        graphics.drawRect(this.moveStrategy.getX(), this.moveStrategy.getY(), 80, 80);
    }
}

