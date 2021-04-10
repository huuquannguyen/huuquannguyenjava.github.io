package lab6.Abstraction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Circle> circles = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            circles.add(new Circle());
            circles.get(i).input();
        }
        System.out.println(circles); 
    }
}
