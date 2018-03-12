package model;

public class GameBuilder {
    private int min;
    private int max;
    private int attemptCount;
    private int target;

    public GameBuilder setMin(int min) {
        this.min = min;
        return this;
    }

    public GameBuilder setMax(int max) {
        this.max = max;
        return this;
    }

    public GameBuilder setAttemptCount(int attemptCount) {
        this.attemptCount = attemptCount;
        return this;
    }

    public GameBuilder setTarget(int target) {
        this.target = target;
        return this;
    }

    public Game createGame() {
        return new Game(min, max, attemptCount, target);
    }
}