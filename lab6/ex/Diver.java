package lab6.ex;

import java.util.*;

public class Diver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sach> books = new ArrayList<>();
        int type,n;
        do{
            System.out.println("Nhap so luong sach: ");
            n = sc.nextInt();
        } while (n<=0);
        for (int i = 0; i < n; i++) {
            do {
                System.out.println("Chon loai sach (1-Sach giao khoa, 2-Do an, 3-Tai lieu dien tu): ");
                type = sc.nextInt();
            } while (type < 1 || type > 3);
            if (type == 1) {
                books.add(new SachGiaoKhoa());
            } else if (type == 2) {
                books.add(new DoAn());
            } else {
                books.add(new TaiLieuDienTu());
            }
            books.get(books.size() - 1).input();
        }
        for (Sach item : books) {
            System.out.println(item);
        }
    }
}
