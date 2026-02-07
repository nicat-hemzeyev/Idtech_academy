package methods;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String word = sc.nextLine();
        String result =reverseString(word);
        System.out.println(result);

    }
    public static String reverseString(String str){
       StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();

    }
}
