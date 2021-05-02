import java.util.Random;

public class Frog extends Animal {


    public Frog(String name, Pos position, int border) {
        super(name, position, border);
    }

    public Frog(String name, int border) {
        super(name, border);
    }

    //di random 3 o theo cac huong len xuong trai phai moi luot
    @Override
    public void move() {
        Random r = new Random();
        int n = r.nextInt(4) + 1;
        Pos newPos = getPosition();
        switch (n) {
            case 1:
                newPos.setX(newPos.getX() + 3);
                setPosition(newPos);
            case 2:
                newPos.setX(newPos.getX() - 3);
                setPosition(newPos);
            case 3:
                newPos.setY(newPos.getY() + 3);
                setPosition(newPos);
            case 4:
                newPos.setY(newPos.getY() - 3);
                setPosition(newPos);
        }
        
    }
    
    
}

