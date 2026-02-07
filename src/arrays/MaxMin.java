package arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        int max = 0;
        int min =arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (max < arr[j])
                max=arr[j];
            if (min > arr[j])
                min=arr[j];
        }
        System.out.println("Max: " +max);
        System.out.println("Min: " +min);

        //or

        OptionalInt max1 = Arrays.stream(arr).max();
        OptionalInt min1 = Arrays.stream(arr).min();
        System.out.println(max1);
        System.out.println(min1);

    }
}