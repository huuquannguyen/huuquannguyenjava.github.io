package lab9.FPTStore;

import java.util.*;

public class Store {
    
    private ArrayList<Product> store;
    Scanner sc = new Scanner(System.in);

    public ArrayList<Product> addItems() {
        store = new ArrayList<>();
        store.add(new Product("1", "iphone", "moi", "apple", 1000000, 1500000, 2, 3, DanhMuc.APPLE));
        store.add(new Product("2", "samsung-galaxy", "moi", "samsung", 2000000, 2500000, 2, 3, DanhMuc.DIENTHOAI));
        store.add(new Product("3", "hp-alienware", "moi", "hp", 3000000, 4500000, 2, 3, DanhMuc.LAPTOP));
        store.add(new Product("4", "sac-du-phong", "moi", "power-bank", 1000000, 7500000, 2, 3, DanhMuc.PHUKIEN));
        store.add(new Product("5", "macbook", "moi", "apple", 5000000, 16000000, 2, 3, DanhMuc.APPLE));
        return store;
    }

    public ArrayList<Product> getStore() {
        return store;
    }

    public void setStore(ArrayList<Product> store) {
        this.store = store;
    }

    public void searchTheoDanhMuc() {
        int s;
        do {
            System.out.println(
                    "Nhap vao danh muc san pham muon tim kiem (DIENTHOAI(1) - LAPTOP(2) - APPLE(3) - PHUKIEN(4)): ");
            s = sc.nextInt();
            sc.nextLine();
        } while (s != 1 && s != 2 && s != 3 && s != 4);
        for (Product product : store) {
            if (product.getDanhMuc().getValue() == s) {
                System.out.println(product.toString());
            }
        }
        System.out.println("Ban co muon tiep tuc tim kiem khong? ( Y or N ): ");
        String tiepTuc = sc.nextLine();
        if (tiepTuc.equalsIgnoreCase("y")) {
            this.searchTheoDanhMuc();
        }
    }
    
    public void searchTheoHang() {
        String s;
        boolean checkExist = false;
        System.out.println("Nhap vao hang: ");
        s = sc.nextLine();
        for (Product product : store) {
            if (product.getHang().equals(s)) {
                System.out.println(product.toString());
                checkExist = true;
            }
        }
        if (!checkExist) {
            System.out.println("Khong co san pham cua hang nay");
        }
        System.out.println("Ban co muon tiep tuc tim kiem khong? ( Y or N ): ");
        String tiepTuc = sc.nextLine();
        if (tiepTuc.equalsIgnoreCase("y")) {
            searchTheoHang();
        }
    }

    public void searchTheoDanhMucVaMucGia() {
        int s;
        int priceOption;
        boolean checkExist = false;
        do {
            System.out.println(
                    "Nhap vao danh muc san pham muon tim kiem (DIENTHOAI(1) - LAPTOP(2) - APPLE(3) - PHUKIEN(4)): ");
            s = sc.nextInt();
        } while (s != 1 && s != 2 && s != 3 && s != 4);
        System.out.println("Nhap vao gia: ");
        priceOption = sc.nextInt();
        sc.nextLine();
        for (Product product : store) {
            if (product.getDanhMuc().getValue() == s) {
                if (priceOption < 2000000 && product.getGiaBan() < 2000000) {
                    System.out.println(product.toString());
                    checkExist = true;
                } else if ((priceOption < 4000000 && priceOption >= 2000000)
                        && (product.getGiaBan() < 4000000 && product.getGiaBan() >= 2000000)) {
                    System.out.println(product.toString());
                    checkExist = true;
                } else if ((priceOption >= 4000000 && priceOption < 7000000)
                        && (product.getGiaBan() >= 4000000 && product.getGiaBan() < 7000000)) {
                    System.out.println(product.toString());
                    checkExist = true;
                } else if ((priceOption >= 7000000 && priceOption < 13000000)
                        && (product.getGiaBan() >= 7000000 && product.getGiaBan() < 13000000)) {
                    System.out.println(product.toString());
                    checkExist = true;
                } else if (priceOption >= 13000000 && product.getGiaBan() >= 13000000) {
                    System.out.println(product.toString());
                    checkExist = true;
                }
            }
        }
        if (!checkExist) {
            System.out.println("Khong co san pham nay!");
        }
        System.out.println("Ban co muon tiep tuc tim kiem khong? ( Y or N ): ");
        String tiepTuc = sc.nextLine();
        if (tiepTuc.equalsIgnoreCase("y")) {
            searchTheoDanhMucVaMucGia();
        }
    }
    
    public void search() {
        String s;
        System.out.println("Nhap vao ten san pham: ");
        s = sc.nextLine();
        boolean checkExist = false;
        for (Product product : store) {
            if (product.getTen().contains(s)) {
                System.out.println(product.toString());
                checkExist = true;
            }
        }
        if (!checkExist) {
            System.out.println("Khong co san pham nay!");
        }
        System.out.println("Ban co muon tiep tuc tim kiem khong? ( Y or N ): ");
        String tiepTuc = sc.nextLine();
        if (tiepTuc.equalsIgnoreCase("y")) {
            search();
        }
    }
}
