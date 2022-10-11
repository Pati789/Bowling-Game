import java.util.Scanner;

public class Game {

    private int[] rolls = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {

        rolls[currentRoll++] = pins;

    }

    public int getScore() {
        int score = 0;
        int rollIndex = 0;
        for (int frameIndex = 0; frameIndex < 10; frameIndex++) {
            if (isStrike(rollIndex)) {
                score += getStrikeScore(rollIndex);
                rollIndex++;
            } else if (isSpare(rollIndex)) {
                score += getSpareScore(rollIndex);
                rollIndex += 2;
            } else {
                score += getStrScore(rollIndex);
                rollIndex += 2;
            }
        }
        return score;
    }

    private boolean isStrike(int rollIndex) {
        return rolls[rollIndex] == 10;
    }

    private boolean isSpare(int rollIndex) {
        return rolls[rollIndex] + rolls[rollIndex + 1] == 10;
    }

    private int getStrikeScore(int rollIndex) {
        return rolls[rollIndex] + rolls[rollIndex + 1] + rolls[rollIndex + 2];

    }

    private int getStrScore(int rollIndex) {
        return rolls[rollIndex] + rolls[rollIndex + 1];
    }

    private int getSpareScore(int rollIndex) {
        return rolls[rollIndex] + rolls[rollIndex + 1] + rolls[rollIndex + 2];
    }
}
