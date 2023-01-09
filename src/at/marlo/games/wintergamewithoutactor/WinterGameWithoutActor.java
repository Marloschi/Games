package at.marlo.games.wintergamewithoutactor;


import at.marlo.games.wintergame.WinterGame;
import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class WinterGameWithoutActor extends BasicGame {

    private float RectangleX, RectangleY, OvalX, OvalY, CircleX, CircleY;
    private boolean RectUp = false;
    private boolean RectDown = false;
    private boolean RectLeft = false;
    private boolean RectRight = true;
    private boolean CircleUp = false;
    private boolean CircleDown = true;
    private boolean OvalRight = true;
    private boolean OvalLeft = false;
    private float speed;



    public WinterGameWithoutActor(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.CircleY = 100;
        this.CircleX = 300;
        this.OvalX = 100;
        this.OvalY = 10;
        this.RectangleX = 100;
        this.RectangleY = 100;
        this.speed = 5.0f;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        if(this.RectRight == true) {
            if(this.RectangleX >= 600){
                this.RectRight = false;
                this.RectDown = true;
            }
            this.RectangleX += (float) delta / this.speed;
        }

        if(this.RectDown == true){
            if(this.RectangleY >= 400){
                this.RectDown = false;
                this.RectLeft = true;
            }
            this.RectangleY += (float) delta / this.speed;
        }

        if(this.RectLeft == true){
            if(this.RectangleX <= 100){
                this.RectLeft = false;
                this.RectUp = true;
            }
            this.RectangleX -= (float) delta / this.speed;
        }
        if(this.RectUp == true){
            if(this.RectangleY <= 100){
                this.RectUp = false;
                this.RectRight = true;
            }
            this.RectangleY -= (float) delta / this.speed;
        }

        if(this.OvalRight == true){
            if(this.OvalX >= 600){
                this.OvalRight = false;
                this.OvalLeft = true;
            }
            this.OvalX += (float) delta / this.speed;
        }

        if(this.OvalLeft == true){
            if(this.OvalX <= 100){
                this.OvalLeft = false;
                this.OvalRight = true;
            }
            this.OvalX -= (float) delta / this.speed;
        }

        if(this.CircleDown == true){
            if(this.CircleY >= 400){
                this.CircleDown = false;
                this.CircleUp = true;
            }
            this.CircleY += (float) delta / this.speed;
        }

        if(this.CircleUp == true){
            if(this.CircleY <= 100){
                this.CircleUp = false;
                this.CircleDown = true;
            }
            this.CircleY -= (float) delta / this.speed;
        }




    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.RectangleX, this.RectangleY,100,100);
        graphics.drawOval(this.CircleX,this.CircleY,100,100);
        graphics.drawOval(this.OvalX,this.OvalY,50,200);
        graphics.drawString("hello you!", 50, 50);
    }

    public static void main(String[] argv) {


        try {
            AppGameContainer container = new AppGameContainer(new WinterGameWithoutActor("Winter Game without Actor"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}