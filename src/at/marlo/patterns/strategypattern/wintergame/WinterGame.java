package at.marlo.patterns.strategypattern.wintergame;


import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class WinterGame extends BasicGame {


    private List<Actor> actors;


    public WinterGame(String title) {
        super(title);
    }

    public static void main(String[] argv) {


        try {
            AppGameContainer container = new AppGameContainer(new WinterGame("Winter Game"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();
        MoveStrategy moveRight1 = new MoveRight(0, 0, 0.2f);
        MoveStrategy moveLeft1 = new MoveLeft(700, 100, 0.1f);
        MoveStrategy moveLeft2 = new MoveLeft(700, 300, 0.1f);


        CircleActor c1 = new CircleActor(moveRight1);
        CircleActor c2 = new CircleActor(moveLeft1);
        RectangleActor r1 = new RectangleActor(moveLeft2);


        this.actors.add(c1);
        this.actors.add(c2);
        this.actors.add(r1);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actors : this.actors
        ) {
            actors.update(gameContainer, delta);
        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actors : this.actors
        ) {
            actors.render(graphics);
        }

    }
}