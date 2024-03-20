// Write a java program to check whether a number is a spy number or not. 

import java.util.Scanner;

public class a1_p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        int product = 1;
        int n = num;
        while (n>0){
            int rem = n%10;
            sum += rem;
            product *= rem;
            n /=10;
        }
        if (sum == product){
            System.out.println(num+" is a spy number.");
        }
        sc.close();
    }
}


// Enter the number: 1124
// 1124 is a spy number.