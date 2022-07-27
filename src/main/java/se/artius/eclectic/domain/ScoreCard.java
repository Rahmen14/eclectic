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

    public Hole[] getHoles() {
        return holes;
    }

    public Hole getHole(int number) {
        return holes[number];
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
