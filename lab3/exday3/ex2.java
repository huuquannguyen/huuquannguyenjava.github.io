package lab3.exday3;

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("nhap do lon cua mang 2 chieu: ");
        int n = input.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("nhap vao cac phan tu mang: ");
                arr[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        
        //cac phan tu nam tren duong cheo chinh
        System.out.println("cac phan tu tren duong cheo chinh: ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i][i] + "\t");
            sum += arr[i][i];
        }
        System.out.println();
        System.out.println("tong cac phan tu tren duong cheo chinh: " + sum);
    }
}
