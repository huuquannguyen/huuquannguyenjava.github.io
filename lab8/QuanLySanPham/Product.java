package lab8.QuanLySanPham;

import java.util.Scanner;

public class Product {
    
    private String ma, ten, moTa;
    private double giaNhap, giaBan;
    private int soLuongBan, soLuongTon;
    Scanner sc = new Scanner(System.in);
    
    public Product(String ma, String ten, String moTa, double giaNhap, double giaBan, int soLuongBan, int soLuongTon) {
        this.ma = ma;
        this.ten = ten;
        this.moTa = moTa;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.soLuongBan = soLuongBan;
        this.soLuongTon = soLuongTon;
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

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public void input() {
        System.out.println("Nhap ma san pham: ");
        ma = sc.nextLine();
        System.out.println("Nhap ten san pham: ");
        ten = sc.nextLine();
        System.out.println("Nhap gia nhap: ");
        giaNhap = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap gia ban: ");
        giaBan = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap mo ta san pham: ");
        moTa = sc.nextLine();
        System.out.println("Nhap so luong ban: ");
        soLuongBan = sc.nextInt();
        System.out.println("Nhap so luong ton: ");
        soLuongTon = sc.nextInt();
    }

    public double loiNhuan() {
        return (giaBan - giaNhap)*soLuongBan;
    }



    @Override
    public String toString() {
        
        return ma + " - " + ten + " - " + moTa + " - " +  giaNhap + " - " + giaBan + " - " + soLuongBan + " - " + soLuongTon + " - " + loiNhuan();
    }
}
