// Write a recursive method in Java which, given an integer n, print it with its digits reversed.

import java.util.Scanner;

public class a3_p9 {

    public static String reverseNumber(int n){
        if(n==0)
            return "";
        else
            return n%10 +reverseNumber(n/10);
    }

    public static int reverseNumber(int n,int sum){
        if(n==0)
            return sum;
        else{
            sum = sum*10 + n%10;
            return reverseNumber(n/10,sum);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Reverse Number: "+reverseNumber(n,0));
        sc.close();
    }
}


// Enter number: 1234
// Reverse Number: 4321