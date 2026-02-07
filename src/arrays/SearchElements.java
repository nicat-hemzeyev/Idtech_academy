package arrays;

import java.util.Scanner;

public class SearchElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir eded daxil edin:");
        int eded = sc.nextInt();
        int[] arr = {3, 2, 1, 6, 9, 7};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == eded) {
                System.out.println("Daxil etdiyiniz eded dogrudur.");

            else System.out.println("Daxil etdiyiniz eded yanlisdir.");
            }


        }
    }
}