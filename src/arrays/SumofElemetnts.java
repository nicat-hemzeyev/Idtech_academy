package arrays;

import java.util.Arrays;

public class SumofElemetnts {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);

        //or
        int sum1 = Arrays.stream(arr).sum();
        System.out.println(sum1);
    }
}