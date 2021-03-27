package lab1;

import java.util.*;

public class ex1 {
    //cau 1
    // biến có thể bị thay đổi giá trị sau khi được gán giá trị khởi tạo
    // hằng thì một khi được gán giá trị khởi tạo rồi thì sẽ không thể bị thay đổi giá trị
    //cau 2
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        System.out.println("Nhap vao 1 chuoi: ");
        s= input.nextLine();
        System.out.println("Do dai cua chuoi: " + s.length());
    }   
}
