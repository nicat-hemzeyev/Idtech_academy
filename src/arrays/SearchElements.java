package arrays;

import java.util.Scanner;

public class SearchElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter search number:");
        int eded = sc.nextInt();
        int[] arr = {3, 2, 1, 6, 9, 7};
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == eded) {
                System.out.println("true");
                a++;
            }
        }
        if (a == 0) {
            System.out.println("false");
        }
    }
}