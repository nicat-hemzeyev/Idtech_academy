package arrays;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {34,32,43,78,95,76,44};
        int[] newArr = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(newArr));
    }
}
