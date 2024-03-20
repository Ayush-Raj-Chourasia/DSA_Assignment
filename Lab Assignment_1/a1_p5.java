// Write a java method to calculate the sum of digits of a given number until the number is a 
// single digit. The method signature is as follows.
// public static int sum_Of_Digits(int n) 


import java.util.Scanner;
public class a1_p5 {
    public static int sum_Of_Digits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no = sc.nextInt();
        int n = no;
        int sum = 0;
        while (true) {
            sum = sum_Of_Digits(no);
            if (sum >= 10)
                no = sum;
            else
                break;

            }
        System.out.println("Sum of digits of " + n + " until the number is a single digit is " + sum);
        sc.close();
    }

}


// Enter a number: 9294
// Sum of digits of 9294 until the number is a single digit is 6
