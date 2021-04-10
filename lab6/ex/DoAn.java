package lab6.ex;

public class DoAn extends Sach implements IKho {
    
    private int soTrang, namBaoVe;
    private String tinhTrang, pos;
    
    public DoAn(String maSach, String tenSach, String nXB, int namXb, int soTrang, int namBaoVe, String tinhTrang, String pos) {
        super(maSach, tenSach, nXB, namXb);
        this.soTrang = soTrang;
        this.namBaoVe = namBaoVe;
        this.tinhTrang = tinhTrang;
        this.pos = pos;
    }

    public DoAn() {
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public int getNamBaoVe() {
        return namBaoVe;
    }

    public void setNamBaoVe(int namBaoVe) {
        this.namBaoVe = namBaoVe;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("Nhap so trang: ");
        soTrang = sc.nextInt();
        System.out.println("Nhap nam bao ve: ");
        namBaoVe = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap tinh trang: ");
        tinhTrang = sc.nextLine();
        System.out.println("Nhap vi tri: ");
        pos = sc.nextLine();
    }

    @Override
    public String viTri() {
        return pos;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " - " + soTrang + " - " + namBaoVe + " - " + tinhTrang + " - " + pos;
    }
}
