package lab5.ex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap so nhan vien");
        int n = sc.nextInt();
        NhanVien[] employees = new NhanVien[n];
        for (int i = 0; i < n; i++) {
            int type;
            do{
                System.out.println("Chon kieu nhan vien");
                type = sc.nextInt();
            } while (type != 1 && type != 2);
            if (type == 1) {
                employees[i] = new LapTrinhVien();
            } else {
                employees[i] = new KiemThuVien();
            }
            employees[i].input();
            System.out.println(employees[i]);
        }
    }
}
