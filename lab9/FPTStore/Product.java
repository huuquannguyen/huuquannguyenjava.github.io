package lab9.FPTStore;

import java.util.*;

public class Product {
    
    private String ma, ten, moTa, hang;
    private int giaNhap, giaBan, soLuongTon, soLuongBan;
    private DanhMuc danhMuc;
    Scanner sc = new Scanner(System.in);
    
    public Product(String ma, String ten, String moTa, String hang, int giaNhap, int giaBan, int soLuongTon,
            int soLuongBan, DanhMuc danhMuc) {
        this.ma = ma;
        this.ten = ten;
        this.moTa = moTa;
        this.hang = hang;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.soLuongTon = soLuongTon;
        this.soLuongBan = soLuongBan;
        this.danhMuc = danhMuc;
    }

    public Product() {
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public DanhMuc getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(DanhMuc danhMuc) {
        this.danhMuc = danhMuc;
    }

    public void input() {
        System.out.println("Nhap ma san pham: ");
        ma = sc.nextLine();
        System.out.println("Nhap ten san pham: ");
        ten = sc.nextLine();
        System.out.println("Nhap mo ta san pham: ");
        moTa = sc.nextLine();
        System.out.println("Nhap hang cua san pham: ");
        hang = sc.nextLine();
        System.out.println("Nhap gia nhap: ");
        giaNhap = sc.nextInt();
        System.out.println("Nhap gia ban: ");
        giaBan = sc.nextInt();
        System.out.println("Nhap so luong ton: ");
        soLuongTon = sc.nextInt();
        System.out.println("Nhap so luong ban: ");
        soLuongBan = sc.nextInt();
    }

    


    @Override
    public String toString() {
        return "Product [danhMuc=" + danhMuc + ", giaBan=" + giaBan + ", giaNhap=" + giaNhap + ", hang=" + hang
                + ", ma=" + ma + ", moTa=" + moTa + ", soLuongBan=" + soLuongBan + ", soLuongTon=" + soLuongTon
                + ", ten=" + ten + "]";
    }




    

    
}
