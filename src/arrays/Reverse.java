package arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] reverseArr=new int[arr.length];
        int j=0;
        for(int i=arr.length-1; i>=0;i--){
            reverseArr[j]=arr[i];
            j++;
        }
        System.out.println("reverse Array: "+ Arrays.toString(reverseArr));
    }

}
