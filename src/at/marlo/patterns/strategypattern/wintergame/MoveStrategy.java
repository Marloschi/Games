package at.marlo.patterns.strategypattern.wintergame;

public interface MoveStrategy {
    float getX();

    float getY();

    void update(int delta);
}
