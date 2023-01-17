package at.marlo.patterns.strategy.wintergame;

public interface MoveStrategy {
    float getX();

    float getY();

    void update(int delta);
}
