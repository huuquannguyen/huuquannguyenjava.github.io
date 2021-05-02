public class Rabbit extends Animal {

    private int moveOrder;

    

    public Rabbit(String name, Pos position, int border) {
        super(name, position, border);
        moveOrder = 1;
    }

    public Rabbit(String name, int border) {
        super(name, border);
        moveOrder = 1;
    }

    public int getMoveOrder() {
        return moveOrder;
    }

    public void setMoveOrder(int moveOrder) {
        this.moveOrder = moveOrder;
        if (moveOrder > 3) {
            moveOrder = 1;
        }
    }

    //di theo hinh chu n
    @Override
    public void move() {
        Pos newPos = getPosition();
        if (moveOrder == 1) {
            newPos.setY(newPos.getY() + 2);
            setPosition(newPos);
            setMoveOrder(++moveOrder);
        } else if (moveOrder == 2) {
            newPos.setX(newPos.getX() + 2);
            setPosition(newPos);
            setMoveOrder(++moveOrder);
        } else {
            newPos.setY(newPos.getY() - 2);
            setPosition(newPos);
            setMoveOrder(++moveOrder);
        }
    }
    
}

