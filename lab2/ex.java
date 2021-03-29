package lab2;

import java.util.*;

public class ex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ex1(input);
        ex2(input);
    }
    

    public static void ex1(Scanner input) {
        int a;
        do{
        System.out.println("nhap a: ");
         a = input.nextInt();
        } while (a < 0);
        System.out.println("nhap b: ");
        int b = input.nextInt();
        System.out.println("nhap c: ");
        int c = input.nextInt();
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("pt vo nghiem");
        } else if (delta == 0) {
            System.out.println("pt co 1 nghiem: " + -b / 2 * a);
        } else {
            System.out.println(
                    "pt co 2 nghiem: " + (-b + Math.sqrt(delta)) / 2 * a + " va " + (-b - Math.sqrt(delta)) / 2 * a);
        }
    }
    
    public static void ex2(Scanner input) {
        System.out.println("nhap n: ");
        int n = input.nextInt();
        String s = "1 ";
        int count =1;
        int beforeNum = 0;
        int currNum=1;
        while (count < n) {
            currNum += beforeNum;
            beforeNum = currNum - beforeNum; // nextNum = currNum + beforeNum => currNUm = nextNum - beforeNum = (currNum + beforeNum)
            count++;                          // - beforeNum
            s += currNum + " ";
        }
        System.out.println("Day fibonaci: "+s);
    }
}
