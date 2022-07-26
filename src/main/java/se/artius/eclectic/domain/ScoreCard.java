package se.artius.eclectic.domain;

public class ScoreCard {

    private int in;
    private int out;

    public ScoreCard(int in, int out) {
        this.in = in;
        this.out = out;
    }

    public int getIn() {
        return in;
    }

    public void setIn(int in) {
        this.in = in;
    }

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }

    public int getTotal() {
        return getIn() + getOut();
    }
}
