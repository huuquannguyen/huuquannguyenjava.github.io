package lab5.ex;

public class LapTrinhVien extends NhanVien {
    
    private int overtime;

    public LapTrinhVien(int id, int age, int salary, int phoneNumber, String name, String email, int overtime) {
        super(id, age, salary, phoneNumber, name, email);
        this.overtime = overtime;
    }

    public LapTrinhVien() {
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.print("Nhap gio lam them: ");
        overtime = sc.nextInt();
    }

    public int totalSalary() {
        return getSalary() + overtime * 200000;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " - " + overtime + " - " + totalSalary();
    }
}
