package se.artius.eclectic.domain;

import javax.persistence.*;

@Entity
public class Player {

    public static final String MASTERS = "masters";
    public static final String NEW_COURSE = "new";

    private @Id Integer id;
    private String firstname;
    private String lastname;
    @OneToOne
    @JoinColumn(name="masters")
    private Scorecard masters;
    @OneToOne
    @JoinColumn(name="newcourse")
    private Scorecard newCourse;

    public Player() {

    }

    public Player(Integer id, String firstname, String lastname, Scorecard masters, Scorecard newCourse) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.masters = masters;
        this.newCourse = newCourse;
    }

    public Scorecard getScoreCard(String courseName) {
        if (courseName.equals(MASTERS)) {
            return getMasters();
        } else if (courseName.equals(NEW_COURSE)) {
            return getNewCourse();
        } else {
            System.out.println("Det finns ingen banan med det namnet.");
            return null;
        }
    }

    public Integer getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Scorecard getMasters() {
        return masters;
    }

    public void setMasters(Scorecard masters) {
        this.masters = masters;
    }

    public Scorecard getNewCourse() {
        return newCourse;
    }

    public void setNewCourse(Scorecard newCourse) {
        this.newCourse = newCourse;
    }

    public int getTotal() {
        return getMasters().getTotal() + getNewCourse().getTotal();
    }

    public int getTotalOut() {
        return getMasters().getOut() + getNewCourse().getOut();
    }

    public int getTotalIn() {
        return getMasters().getIn() + getNewCourse().getIn();
    }

    public int getMastersTotal() {
        return getMasters().getTotal();
    }

    public int getNewTotal() {
        return getNewCourse().getTotal();
    }
}
