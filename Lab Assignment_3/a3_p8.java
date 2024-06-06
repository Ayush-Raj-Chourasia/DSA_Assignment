// Write a recursive method in Java which, given real value x and a positive integer n, returns the value of x^n.

import java.util.Scanner;

public class a3_p8 {

    public static int pow(int base,int power){
        if(base==0)
            return 0;
        else if(power==0)
            return 1;
        else
            return base*pow(base, power-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base value: ");
        int base = sc.nextInt();
        System.out.print("Enter power value: ");
        int power = sc.nextInt();
        System.out.println(base+"^"+power+" = "+pow(base, power));
        sc.close();
    }
}

// Enter base value: 20
// Enter power value: 10
// 20^10 = 797966336
