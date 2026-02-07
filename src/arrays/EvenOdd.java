package arrays;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr ={3,4,6,7,9,12,};
        int evenCount =0;
        int oddCount =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                evenCount++;
            else
                oddCount++;
        }
        System.out.println("Even: "+evenCount);
        System.out.println("Odd: " +oddCount);
    }
}
