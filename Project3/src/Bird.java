import java.util.Random;

public class Bird extends Animal {
   

    public Bird(String name, int border) {
        super(name, border);
    }

    public Bird(String name, Pos position, int border) {
        super(name, position, border);
    }

    //di random 1 o theo cac huong len xuong trai phai moi luot
    @Override
    public void move() {
        Random r = new Random();
        int n = r.nextInt(4) + 1;
        Pos newPos = getPosition();
        switch (n) {
            case 1:
                newPos.setX(newPos.getX() + 1);
                setPosition(newPos);
                break;
            case 2:
                newPos.setX(newPos.getX() - 1);
                setPosition(newPos);
                break;
            case 3:
                newPos.setY(newPos.getY() + 1);
                setPosition(newPos);
                break;
            case 4:
                newPos.setY(newPos.getY() - 1);
                setPosition(newPos);
                break;
        }
        
    }
    
}

