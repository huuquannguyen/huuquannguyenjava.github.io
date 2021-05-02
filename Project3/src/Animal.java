import java.util.Random;

public abstract class Animal {
    
    private String name;
    private Pos position;
    private final int border;

    public Animal(String name, Pos position, int border) {
        this.name = name;
        this.position = position;
        this.border = border;
    }

    public Animal(String name, int border) {
        this.name = name;
        this.border = border;
        Random r = new Random();
        int x = r.nextInt(border);
        int y = r.nextInt(border);
        this.position = new Pos(x, y);
	}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Pos getPosition() {
        return position;
    }

    public void setPosition(Pos position) {
        this.position = position;
    }

    public void setRandomPosition() {
            Random r = new Random();
            position.setX(r.nextInt(border));
            position.setY(r.nextInt(border));
    }
    
    public abstract void move();
    
    @Override
    public String toString() {
        return name + position.toString();
    }
}