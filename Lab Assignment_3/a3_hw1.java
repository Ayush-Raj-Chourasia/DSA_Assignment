// Write a recursive method in Java to return the greatest common divisor(gcd) of two integers m and n, given that in general,  gcd(m,n)=gcd(n, m mod n).

import java.util.Scanner;

public class a3_hw1 {

    public static int gcd(int n,int m){
        if (m==0)
            return n;
        else
            return gcd(m,n%m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int m = sc.nextInt();
        System.out.print("Enter second number: ");
        int n = sc.nextInt();
        if (m<n)
            System.out.println("GCD of "+n+" and "+m+" is "+gcd(n, m));
        else
            System.out.println("GCD of "+m+" and "+n+" is "+gcd(m, n));
        sc.close();
    }
    
}


// Enter first number: 12345
// Enter second number: 5
// GCD of 12345 and 5 is 5