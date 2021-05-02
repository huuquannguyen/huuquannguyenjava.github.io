public class Wolf extends Animal {


    public Wolf(String name, Pos position, int border) {
        super(name, position, border);
    }

    public Wolf(String name, int border) {
        super(name, border);
    }

    //di theo duong cheo
    @Override
    public void move() {
        Pos newPos = getPosition();
        newPos.setX(newPos.getX() + 1);
        newPos.setY(newPos.getY() + 1);
        setPosition(newPos);
    }
    
}

