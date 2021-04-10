package lab6.ex;

import java.util.Scanner;

public class Sach {
    private String maSach, tenSach, nXB;
    private int namXb;
    Scanner sc = new Scanner(System.in);
    
    public Sach(String maSach, String tenSach, String nXB, int namXb) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nXB = nXB;
        this.namXb = namXb;
    }

    public Sach() {
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getnXB() {
        return nXB;
    }

    public void setnXB(String nXB) {
        this.nXB = nXB;
    }

    public int getNamXb() {
        return namXb;
    }

    public void setNamXb(int namXb) {
        this.namXb = namXb;
    }

    public void input() {
        System.out.println("Nhap ma sach:");
        maSach = sc.nextLine();
        System.out.println("Nhap ten sach:");
        tenSach = sc.nextLine();
        System.out.println("Nhap NXB:");
        nXB = sc.nextLine();
        System.out.println("Nhap nam xuat ban:");
        namXb = sc.nextInt();
    }

    @Override
    public String toString() {
        return maSach + " - " + tenSach + " - " + nXB + " - " + namXb;
    }
    
}
