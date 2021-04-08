package lab5.ex;

public class KiemThuVien extends NhanVien {
    
    private int foundBugs;

    public KiemThuVien(int id, int age, int salary, int phoneNumber, String name, String email, int foundBugs) {
        super(id, age, salary, phoneNumber, name, email);
        this.foundBugs = foundBugs;
    }

    public KiemThuVien() {
    }

    public int getFoundBugs() {
        return foundBugs;
    }

    public void setFoundBugs(int foundBugs) {
        this.foundBugs = foundBugs;
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.print("Nhap vao so loi tim duoc: ");
        foundBugs = sc.nextInt();
    }

    public int totalSalary() {
        return getSalary() + foundBugs * 50000;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " - " + foundBugs + " - " + totalSalary();
    }
}
