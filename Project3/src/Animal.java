import java.util.Random;

public abstract class Animal {
    
    //variable border là giới hạn của pos
    private String name;
    private Pos position;
    private final int border;


    //constructor set vị trí mặc định của con vật
    public Animal(String name, Pos position, int border) {
        this.name = name;
        this.position = position;
        this.border = border;
    }

    //constructor set vị trí ngẫu nhiên của con vật
    //nhận border là giới hạn để lấy số random
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

    //method để set vị trí ngẫu nhiên cho con vật
    public void setRandomPosition() {
        Random r = new Random();
        position.setX(r.nextInt(border));
        position.setY(r.nextInt(border));
    }
    
    // abstract method sẽ được định nghĩa cụ thể trong mỗi lớp con vật
    public abstract void move();
    
    @Override
    public String toString() {
        return name + position.toString();
    }
}