public class Turtle extends Animal {

    private int moveStep;
    
	public Turtle(String name, Pos position, int border) {
        super(name, position, border);
        moveStep = 1;
    }

    public Turtle(String name, int border) {
        super(name, border);
        moveStep = 1;
    }

    public int getMoveStep() {
        return moveStep;
    }

    public void setMoveStep(int moveStep) {
        this.moveStep = moveStep;
        if (this.moveStep > 4) {
            this.moveStep = 1;
        }
    }

    //di theo hinh o vuong do 5 o 1 luot
    @Override
    public void move() {
        Pos newPos = getPosition();
        switch (moveStep){
            case 1:
                newPos.setY(newPos.getY() - 5);
                setPosition(newPos);
                moveStep++;
                setMoveStep(moveStep);
                break;
            case 2:
                newPos.setX(newPos.getX() -  5);
                setPosition(newPos);
                moveStep++;
                setMoveStep(moveStep);
                break;
            case 3:
                newPos.setY(newPos.getY() + 5);
                setPosition(newPos);
                moveStep++;
                setMoveStep(moveStep);
                break;
            case 4:
                newPos.setX(newPos.getX() + 5);
                setPosition(newPos);
                moveStep++;
                setMoveStep(moveStep);
                break;
        }
    }   
}

