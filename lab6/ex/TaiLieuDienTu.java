package lab6.ex;

public class TaiLieuDienTu extends Sach implements IDownload {
    
    private double dungLuong, giaThanh;
    private int luotTai;
    
    public TaiLieuDienTu(String maSach, String tenSach, String nXB, int namXb, double dungLuong, double giaThanh,
            int luotTai) {
        super(maSach, tenSach, nXB, namXb);
        this.dungLuong = dungLuong;
        this.giaThanh = giaThanh;
        this.luotTai = luotTai;
    }

    public TaiLieuDienTu() {
    }

    public double getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(double dungLuong) {
        this.dungLuong = dungLuong;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        this.giaThanh = giaThanh;
    }

    public int getLuotTai() {
        return luotTai;
    }

    public void setLuotTai(int luotTai) {
        this.luotTai = luotTai;
    }
    
    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("Nhap dung luong (double): ");
        dungLuong = sc.nextDouble();
        System.out.println("Nhap gia thanh: ");
        giaThanh = sc.nextDouble();
        System.out.println("Nhap luot tai: ");
        luotTai = sc.nextInt();
    }

    @Override
    public double tongTien() {
        return luotTai * giaThanh;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " - " + dungLuong + " - " + giaThanh + " - " + luotTai + " - " + tongTien();
    }
}
