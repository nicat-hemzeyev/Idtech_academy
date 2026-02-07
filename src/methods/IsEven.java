
package methods;

import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isEven(number));
    }
    public static boolean isEven(int number){
        return number%2==0;
    }
}

