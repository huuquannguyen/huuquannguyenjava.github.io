package lab8.QuanLySanPham;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n;
        boolean check = false;
        int num = 0;
        do {
            System.out.println("Nhap vao so san pham (0 < n < 100):");
            n = sc.nextLine();
            try {
                num = Integer.parseInt(n);
                if(num <= 0 || num > 100){
                    throw new IllegalArgumentException();
                } else {
                    check = true;
                }
            }catch (NumberFormatException e){
                System.out.println("Nhap so!!!");
            }catch(IllegalArgumentException ex){
                System.out.println("Xem lai dieu kien!!!");
            }
        } while (!check);
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            products.add(new Product());
            products.get(i).input();
        }
        for (Product product : products) {
            while (product.getSoLuongTon() < 5) {
                System.out.print("San pham [" + product.getTen() + "] sap het, nhap vao so luong nhap them: ");
                int nhapThem = sc.nextInt();
                product.setSoLuongTon(product.getSoLuongTon() + nhapThem);
            }
            System.out.println(product);
        }
    }
}
