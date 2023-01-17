package at.marlo.patterns.strategy.wintergame;

import org.newdawn.slick.Graphics;

public class CircleActor extends AbstractActor {


    public CircleActor(MoveStrategy moveStrategy) {
        super(moveStrategy);
    }

    @Override
    public void render(Graphics graphics) {

        graphics.drawOval(this.moveStrategy.getX(), this.moveStrategy.getY(), 80, 80);
    }
}
