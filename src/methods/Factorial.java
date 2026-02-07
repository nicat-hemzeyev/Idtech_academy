package methods;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();
        System.out.println(factorial(number));
    }
    public static int factorial(int number){
        if(number==1)
            return number;
        else return number*factorial(number-1);

    }
}
