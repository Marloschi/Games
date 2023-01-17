package at.marlo.patterns.factory.game;

public interface MoveStrategy {
    float getX();

    float getY();

    void update(int delta);
}
