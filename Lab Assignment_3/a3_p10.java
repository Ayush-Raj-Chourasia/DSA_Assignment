// The sequence of numbers 1, 1, 2, 3, 5, 8, 13 etc are called Fibonacci numbers,
// each is the sum of the preceding two. Write a recursive method in Java which, given n,
// returns the nth Fibonacci number.

import java.util.Scanner;

public class a3_p10 {
    public static int fibonacci(int n){
        if(n==0 || n==1)
            return n;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms of fibonacci series: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
            System.out.print(fibonacci(i)+" ");
        sc.close();
    }
}


// Enter number of terms of fibonacci series: 10
// 0 1 1 2 3 5 8 13 21 34 