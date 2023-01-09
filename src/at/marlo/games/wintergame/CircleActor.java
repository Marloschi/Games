package at.marlo.games.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CircleActor implements Actor {
    private final float x;
    private final float speed;
    private float y;
    private boolean CircleUp = false;
    private boolean CircleDown = true;

    public CircleActor(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }


    @Override
    public void render(Graphics graphics) {

        graphics.drawOval(this.x, this.y, 80, 80);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        if (this.CircleDown) {
            if (this.y >= 400) {
                this.CircleDown = false;
                this.CircleUp = true;
            }
            this.y += (float) delta / this.speed;
        }

        if (this.CircleUp) {
            if (this.y <= 100) {
                this.CircleUp = false;
                this.CircleDown = true;
            }
            this.y -= (float) delta / this.speed;
        }
    }
}
