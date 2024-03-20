// Write a Java method, isOdd( ), that takes an int i and returns true if and only if i is odd. Your 
// method can't use the multiplication, modulus, or division operators, The method signature is 
// as follows. 
 
// public static boolean isOdd(int n)

import java.util.Scanner;

public class a1_p6 {
    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no = sc.nextInt();
        System.out.println(no + " is odd: " + isOdd(no));
        sc.close();
    }
}

// Enter a number: 37
// 37 is odd: true