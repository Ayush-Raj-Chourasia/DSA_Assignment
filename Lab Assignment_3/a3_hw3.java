// Write a recursive method in Java to find the binary equivalent of a positive decimal integer.

import java.util.Scanner;

public class a3_hw3 {
    
    public static int decimalToBinary(int n){
        if(n<2)
            return n;
        else
            return (n%2)+10*decimalToBinary(n/2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive decimal number: ");
        int n = sc.nextInt();
        System.out.println("Binary to decimal of "+n+" is "+decimalToBinary(n));
        sc.close();
    }
}


// Enter positive decimal number: 10
// Binary to decimal of 10 is 1010


// Execution Trace
// decimalToBinary called with n = 10
// decimalToBinary called with n = 5
// decimalToBinary called with n = 2
// decimalToBinary called with n = 1
// Returning 1
// Computed (2 % 2) + 10 * decimalToBinary(2 / 2) = 10
// Computed (5 % 2) + 10 * decimalToBinary(5 / 2) = 101
// Computed (10 % 2) + 10 * decimalToBinary(10 / 2) = 1010
// Binary to decimal of 10 is 1010
