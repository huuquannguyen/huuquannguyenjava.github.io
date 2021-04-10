package lab6.Abstraction;

import java.util.*;

public class Circle extends Shape {

    private double r;
    Scanner sc = new Scanner(System.in);

    public Circle(double r) {
        this.r = r;
    }

    public Circle() {
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void input(){
        System.out.println("Nhap r: ");
        r = sc.nextInt();
    }

    @Override
    public void tinhChuVi() {
        // TODO Auto-generated method stub
        System.out.println("Chu vi hinh tron: " + Math.PI * 2 * r);
    }

    @Override
    public String toString() {
        return "Circle [r=" + r + "]";
    }

    
    

}
