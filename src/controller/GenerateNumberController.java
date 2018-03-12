package controller;

import java.util.Random;

public class GenerateNumberController {

    private final Random random;

    public GenerateNumberController(Random random) {
        this.random = random;
    }

    public int generate(final int min, final int max) {
        final int size = max - min;
        final int randomValue = random.nextInt() % size;
        return min + randomValue;
    }

}
