package controller;

import model.Game;

import java.util.Random;

public class GenerateNumberController {

    private Random random;

    public int generate(Game game) {
        final int size = game.getMax() - game.getMin();
        final int randomValue = random.nextInt() % size;
        return game.getMin() + randomValue;
    }

}
