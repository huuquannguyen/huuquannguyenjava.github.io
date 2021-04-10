package lab6.Abstraction;

public class Square extends Shape {
    
    private double canh;

    public Square(double canh) {
        this.canh = canh;
    }

    public Square() {
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public void tinhChuVi() {
        // TODO Auto-generated method stub
        System.out.println("chu vi hinh vuong: " + canh*4);
    }
}
