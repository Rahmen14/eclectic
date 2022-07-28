package se.artius.eclectic.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScoreCard {

    private final Hole[] holes = new Hole[18];
    private final int numberOfRelocks;
    private int numberOfRelocksUsed;

    public ScoreCard(List<Hole> holes, int numberOfRelocks) {
        holes.toArray(this.holes);
        this.numberOfRelocks = numberOfRelocks;
    }

    private void updateScore(int number, int score) {
        getHole(number).setScore(score);
        System.out.println("Scoren är uppdaterad och det nya resultatet är " + score + ".");
        getHole(number).setLocked(true);
    }

    public void relockAndUpdateScore(int number, int score) {
        if (getHole(number).isLocked()) {
            if (getNumberOfRelocks() > 0) {
                updateScore(number, score);
                increaseNumberOfRelocks();
            } else {
                System.out.println("Hålet är redan låst och det finns inga omlåsningar kvar.");
            }
        } else {
            updateScore(number, score);
        }
    }

    private void increaseNumberOfRelocks() {
        numberOfRelocksUsed--;
    }

    public Hole[] getHoles() {
        return holes;
    }

    public Hole getHole(int number) {
        return holes[number - 1];
    }

    public int getIn() {
        return countScore(10, 18);
    }

    public int getOut() {
        return countScore(1, 9);
    }

    private int countScore(int start, int stop) {
        int result = 0;
        for (int i = start - 1; i < stop; i++) {
            result += holes[i].getScore();
        }
        return result;
    }

    public int getTotal() {
        return getIn() + getOut();
    }

    public int getNumberOfRelocks() {
        return numberOfRelocks;
    }
}
