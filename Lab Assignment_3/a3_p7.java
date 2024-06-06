// Write a recursive method in Java that computes the factorial of a given integer.

import java.util.Scanner;

public class a3_p7 {
    public static long factorial(int n){
        if(n==0 || n==1)
            return 1;
        else{
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" is: "+factorial(n));
        sc.close();
    }
}


// Enter number: 5 
// Factorial of 5 is: 120