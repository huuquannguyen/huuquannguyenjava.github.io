public class Mouse extends Animal {

    private boolean goWest;

    
    
    public Mouse(String name, Pos position, int border) {
        super(name, position, border);
        goWest = true;
    }



    public Mouse(String name, int border) {
        super(name, border);
        goWest = true;
    }



    //di theo hinh zic-zac len tren
	@Override
    public void move() {
        Pos newPos = getPosition();
        if (goWest) {
            newPos.setX(newPos.getX() + 1);
            setPosition(newPos);
            goWest = false;
        } else {
            newPos.setY(newPos.getY() + 1);
            setPosition(newPos);
            goWest = true;
        }
        
    }
    
}

