package lab3.exday3;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        arr[0] = input.nextInt();
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i] = input.nextInt();
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        show(arr);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        // so nguyen to
        int sumSNT = 0;
        System.out.print("cac snt trong mang: ");
        for (int i = 0; i < n; i++) {
            boolean isSNT = true;
            if (arr[i] == 2) {
                sumSNT += 2;
                System.out.print("2 ");
                continue;
            }
            for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                if (arr[i] % j == 0) {
                    isSNT = false;
                    break;
                }
            }
            if (isSNT) {
                sumSNT += arr[i];
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("tong cac snt: " + sumSNT);

        // thay doi gia tri tai vi tri k
        System.out.println("nhap vao vi tri muon thay doi: ");
        int k = input.nextInt();
        System.out.println("nhap vao gia tri muon thay doi: ");
        arr[k] = input.nextInt();
        System.out.println("mang sau khi thay doi gia tri: ");
        show(arr);
    }
    
    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
