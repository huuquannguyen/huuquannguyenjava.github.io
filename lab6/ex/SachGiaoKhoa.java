package lab6.ex;

public class SachGiaoKhoa extends Sach implements IKho, IMuon {
    
    private int soTrang, tongSoLuong, soLuongMuon;
    private String tinhTrang, pos;
    
    public SachGiaoKhoa(String maSach, String tenSach, String nXB, int namXb, int soTrang, int tongSoLuong,
            int soLuongMuon, String tinhTrang, String pos) {
        super(maSach, tenSach, nXB, namXb);
        this.soTrang = soTrang;
        this.tongSoLuong = tongSoLuong;
        this.soLuongMuon = soLuongMuon;
        this.tinhTrang = tinhTrang;
        this.pos = pos;
    }

    public SachGiaoKhoa() {
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public int getTongSoLuong() {
        return tongSoLuong;
    }

    public void setTongSoLuong(int tongSoLuong) {
        this.tongSoLuong = tongSoLuong;
    }

    public int getSoLuongMuon() {
        return soLuongMuon;
    }

    public void setSoLuongMuon(int soLuongMuon) {
        this.soLuongMuon = soLuongMuon;
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
        System.out.println("Nhap tong so luong: ");
        tongSoLuong = sc.nextInt();
        System.out.println("Nhap so luong muon: ");
        soLuongMuon = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap tinh trang: ");
        tinhTrang = sc.nextLine();
        System.out.println("Nhap vi tri: ");
        pos = sc.nextLine();
        
    }

    @Override
    public int tonKho() {
        return tongSoLuong - soLuongMuon;
    }

    @Override
    public String viTri() {
        return pos;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " - " + soTrang + " - " + tongSoLuong + " - " + soLuongMuon + " - " + tonKho() + " - " + pos;
    }

}
