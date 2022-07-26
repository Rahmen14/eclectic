package se.artius.eclectic.domain;

public class Hole {

    private final int number;
    private final int par;
    private int score;
    private boolean locked = false;

    public Hole(int number, int par) {
        this.number = number;
        this.par = par;
        this.score = par + 2;
    }

    public int getNumber() {
        return number;
    }

    public int getPar() {
        return par;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
