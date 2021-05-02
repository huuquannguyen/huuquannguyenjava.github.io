public class Snake extends Animal {

    private int step;
    private boolean moveDown;
    private boolean moveRight;

    

    public Snake(String name, Pos position, int border) {
        super(name, position, border);
        step = 1;
        moveDown = true;
        moveRight = true;
    }



    public Snake(String name, int border) {
        super(name, border);
        step = 1;
        moveDown = true;
        moveRight = true;
    }



    // di theo kieu xuong 1, sang phải 1, xuong 1, sang trai 2, xuong 1, sang phai 3,...
    @Override
    public void move() {
        Pos newPos = getPosition();
        if (moveDown) {
            newPos.setY(newPos.getY() - 1);
            setPosition(newPos);
            moveDown = false;
        } else {
            if (moveRight) {
                newPos.setX(newPos.getX() + step);
                setPosition(newPos);
                step++;
                moveRight = false;
            } else {
                newPos.setX(newPos.getX() - step);
                setPosition(newPos);
                step++;
                moveRight = true;
            }
        }
    }    
}

