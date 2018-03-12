package controller;

import model.GuessResult;

public class NumberCheckerController {

    public static GuessResult numberEqualityCheck(final int guess, final int target) {
        if (guess > target) {
            return GuessResult.GUESS_IS_BIGGER;
        } else if (guess < target) {
            return GuessResult.GUESS_IS_SMALLER;
        }
        return GuessResult.EQUAL;
    }

}
