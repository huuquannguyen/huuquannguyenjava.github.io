package lab7;

public class Player {
    private String fullName;
    private position pos;
    private int number;
    
    public Player(String fullName, position pos, int number) {
        this.fullName = fullName;
        this.pos = pos;
        this.number = number;
    }

    public Player() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public position getPos() {
        return pos;
    }

    public void setPos(position pos) {
        this.pos = pos;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    @Override
    public String toString() {
        return fullName + " - " + pos + " - " + number;
    }
}
