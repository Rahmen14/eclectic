package se.artius.eclectic.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Scorecard {


    private @Id Integer id;
    @OneToMany
    @JoinColumn(name="scorecard", nullable=false)
    private List<Hole> holes;
    private int numberofrelocks;
    private int numberofrelocksused;

    public Scorecard() {
    }

    private void updateScore(int number, int score) {
        getHole(number).setScore(score);
        System.out.println("Scoren är uppdaterad och det nya resultatet är " + score + ".");
        getHole(number).setLocked(true);
    }

    public void relockAndUpdateScore(int number, int score) {
        if (getHole(number).isLocked()) {
            if (getNumberofrelocks() > 0) {
                updateScore(number, score);
                increaseNumberOfRelocksUsed();
            } else {
                System.out.println("Hålet är redan låst och det finns inga omlåsningar kvar.");
            }
        } else {
            updateScore(number, score);
        }
    }

    private void increaseNumberOfRelocksUsed() {
        numberofrelocksused++;
    }

    public Hole[] getHoles() {
        return holes.toArray(new Hole[18]);
    }

    public Hole getHole(int number) {
        return getHoles()[number - 1];
    }

    public int getIn() {
        return countScore(10, 18);
    }

    public int getOut() {
        return countScore(1, 9);
    }

    private int countScore(int start, int stop) {
        int result = 0;
        Hole[] holes = getHoles();
        for (int i = start - 1; i < stop; i++) {
            result += holes[i].getScore();
        }
        return result;
    }

    public int getTotal() {
        return getIn() + getOut();
    }

    public int getNumberofrelocks() {
        return numberofrelocks;
    }
}
