package se.artius.eclectic.domain;

import javax.persistence.*;

@Entity
public class Hole {

    private @Id Integer id;
    private int par;
    private int score;
    private boolean locked = false;

    public Hole() {
    }

    public Hole(int id, int par) {
        this.id = id;
        this.par = par;
        this.score = par + 2;
    }

    public int getId() {
        return id;
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
