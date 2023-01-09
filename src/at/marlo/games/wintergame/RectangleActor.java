package at.marlo.games.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class RectangleActor implements Actor {
    private final float speed;
    private float x, y;
    private boolean RectUp = false;
    private boolean RectDown = false;
    private boolean RectLeft = false;
    private boolean RectRight = true;

    public RectangleActor(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawRect(this.x, this.y, 100, 100);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        if (this.RectRight) {
            if (this.x >= 600) {
                this.RectRight = false;
                this.RectDown = true;
            }
            this.x += (float) delta / this.speed;
        }

        if (this.RectDown) {
            if (this.y >= 400) {
                this.RectDown = false;
                this.RectLeft = true;
            }
            this.y += (float) delta / this.speed;
        }

        if (this.RectLeft) {
            if (this.x <= 100) {
                this.RectLeft = false;
                this.RectUp = true;
            }
            this.x -= (float) delta / this.speed;
        }
        if (this.RectUp) {
            if (this.y <= 100) {
                this.RectUp = false;
                this.RectRight = true;
            }
            this.y -= (float) delta / this.speed;
        }
    }
}



