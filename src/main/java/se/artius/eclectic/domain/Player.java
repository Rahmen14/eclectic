package se.artius.eclectic.domain;

public class Player {

    private String firstName;
    private String lastName;
    private int mastersTotal;
    private int mastersIn;
    private int mastersOut;
    private int newTotal;
    private int newIn;
    private int newOut;

    public Player() {

    }
    
    public Player(String firstName, String lastName, int mastersTotal, int newTotal) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mastersTotal = mastersTotal;
        this.newTotal = newTotal;
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

    public int getTotal() {
        return getMastersTotal() + getNewTotal();
    }

    public int getMastersTotal() {
        return mastersTotal;
    }

    public void setMastersTotal(int mastersTotal) {
        this.mastersTotal = mastersTotal;
    }

    public int getMastersIn() {
        return mastersIn;
    }

    public void setMastersIn(int mastersIn) {
        this.mastersIn = mastersIn;
    }

    public int getMastersOut() {
        return mastersOut;
    }

    public void setMastersOut(int mastersOut) {
        this.mastersOut = mastersOut;
    }

    public int getNewTotal() {
        return newTotal;
    }

    public void setNewTotal(int newTotal) {
        this.newTotal = newTotal;
    }

    public int getNewIn() {
        return newIn;
    }

    public void setNewIn(int newIn) {
        this.newIn = newIn;
    }

    public int getNewOut() {
        return newOut;
    }

    public void setNewOut(int newOut) {
        this.newOut = newOut;
    }
}
