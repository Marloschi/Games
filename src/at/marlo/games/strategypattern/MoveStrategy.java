package at.marlo.games.strategypattern;

public interface MoveStrategy {
    float getX();

    float getY();

    void update(int delta);
}
