package lab9.FPTStore;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Store cuaHang = new Store();
        cuaHang.addItems();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap yeu cau(2-3-4-5): ");
        n = sc.nextInt();
        switch (n) {
        case 2:
            System.out.println("Search theo danh muc");
            cuaHang.searchTheoDanhMuc();
            break;
        case 3:
            System.out.println("Search theo hang");
            cuaHang.searchTheoHang();
            break;
        case 4:
            System.out.println("Search theo danh muc va gia");
            cuaHang.searchTheoDanhMucVaMucGia();
            break;
        case 5:
            System.out.println("Search theo ten");
            cuaHang.search();
            break;
        default:
            System.out.println("Nhap lai!");
            break;
        }
    }
}
