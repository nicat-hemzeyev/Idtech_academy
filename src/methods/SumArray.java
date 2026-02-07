package methods;

public class SumArray {
    public static void main(String[] args) {
/*       int[] numbers ={3,4,5,6,6,6,7};
*        int result =sumArray(numbers);
*       System.out.println(result);
*                  or
*/
        int result = sumArray( new int[]{1,2,3});
        System.out.println(result);
    }
    public static int sumArray(int[] arr){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
