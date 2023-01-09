package at.marlo.games.wintergame;


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
        this.actors.add(new RectangleActor(100, 100, 10));
        this.actors.add(new CircleActor(100, 100, 10));
        this.actors.add(new OvalActor(200, 100, 10));
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