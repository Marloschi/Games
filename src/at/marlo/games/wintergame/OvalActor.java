package at.marlo.games.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class OvalActor implements Actor {
    private final float y;
    private final float speed;
    private float x;
    private boolean OvalRight = true;
    private boolean OvalLeft = false;

    public OvalActor(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }


    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, 140, 80);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        if (this.OvalRight) {
            if (this.x >= 600) {
                this.OvalRight = false;
                this.OvalLeft = true;
            }
            this.x += (float) delta / this.speed;
        }

        if (this.OvalLeft) {
            if (this.x <= 100) {
                this.OvalLeft = false;
                this.OvalRight = true;
            }
            this.x -= (float) delta / this.speed;
        }
    }
}


