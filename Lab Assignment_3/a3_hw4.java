// Write a recursive method in Java to find the product of 2 numbers.

import java.util.Scanner;

public class a3_hw4 {
    public static int product(int a , int b){
        if(a==0 || b==0)
            return 0;
        else if(b>0)
            return a+product(a,b-1);
        else
            return -product(a, -b);
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Product of "+a+" and "+b+" is "+product(a, b));
        sc.close();
    }
}


// Enter first number: 5
// Enter second number: 4
// Product of 5 and 4 is 20

// Enter first number: -5
// Enter second number: 4
// Product of -5 and 4 is -20

// Enter first number: -5
// Enter second number: -5
// Product of -5 and -5 is 25

// Execution Trace
// product(5, 4)
//   -> 5 + product(5, 3)
//     -> 5 + (5 + product(5, 2))
//       -> 5 + (5 + (5 + product(5, 1)))
//         -> 5 + (5 + (5 + (5 + product(5, 0))))
//           -> product(5, 0) returns 0
//         -> 5 + (5 + (5 + 5 + 0)) = 20
//       -> 5 + (5 + 10) = 15
//     -> 5 + 15 = 20
//   -> 20



//   product(-5, 4)
//   -> -5 + product(-5, 3)
//     -> -5 + (-5 + product(-5, 2))
//       -> -5 + (-5 + (-5 + product(-5, 1)))
//         -> -5 + (-5 + (-5 + (-5 + product(-5, 0))))
//           -> product(-5, 0) returns 0
//         -> -5 + (-5 + (-5 + -5 + 0)) = -20
//       -> -5 + (-5 + -10) = -15
//     -> -5 + -15 = -20
//   -> -20



//   product(-5, -5)
//   -> -product(-5, 5)
//     -> -(-5 + product(-5, 4))
//       -> -(-5 + (-5 + product(-5, 3)))
//         -> -(-5 + (-5 + (-5 + product(-5, 2))))
//           -> -(-5 + (-5 + (-5 + (-5 + product(-5, 1)))))
//             -> -(-5 + (-5 + (-5 + (-5 + (-5 + product(-5, 0))))))
//               -> product(-5, 0) returns 0
//             -> -(-5 + (-5 + (-5 + (-5 + (-5 + 0))))) = 25
//           -> -(-5 + (-5 + (-5 + (-5 + -5)))) = 25
//         -> -(-5 + (-5 + (-5 + -10))) = 25
//       -> -(-5 + (-5 + -15)) = 25
//     -> -(-5 + -20) = 25
//   -> -(-25) = 25
