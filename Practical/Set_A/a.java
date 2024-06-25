package Practical.Set_A;

// Find gcd of two numbers using recursive method


import java.util.Scanner;

public class a {

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