package lab1;

import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        String s1, s2;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao 2 chuoi: ");
        s1 = input.nextLine();
        s2 = input.nextLine();
        System.out.println("Chuoi 1 giong chuoi 2 la: " + s1.equals(s2));
    }
}
