package model;

public class Game {

    private final int min;
    private final int max;
    private final int attemptCount;
    private final int target;

    private Game(
            final int min,
            final int max,
            final int attemptCount,
            final int target) {
        this.min = min;
        this.max = max;
        this.attemptCount = attemptCount;
        this.target = target;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getAttemptCount() {
        return attemptCount;
    }

    public int getTarget() {
        return target;
    }

    public static class GameBuilder {
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

}
