package se.artius.eclectic.domain;

public class Player {

    private String firstName;
    private String lastName;
    private ScoreCard masters;
    private ScoreCard newCourse;

    public Player() {

    }
    
    public Player(String firstName, String lastName, ScoreCard masters, ScoreCard newCourse) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.masters = masters;
        this.newCourse = newCourse;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ScoreCard getMasters() {
        return masters;
    }

    public void setMasters(ScoreCard masters) {
        this.masters = masters;
    }

    public ScoreCard getNewCourse() {
        return newCourse;
    }

    public void setNewCourse(ScoreCard newCourse) {
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
