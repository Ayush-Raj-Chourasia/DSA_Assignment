// Write  a  Java  program  that  takes  as  input  three  integers,  a,  b,  and  c,  from  the  Java  console 
// and  determines  if  they  can  be  used  in  a  correct  arithmetic  formula  (in  the  given  order),  like 
// “a + b = c,” “a = b − c,” or “a b = c.”∗



import java.util.*;
public class a1_hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        System.out.print("Enter the first integer a: ");
        int a = sc.nextInt();

        System.out.print("Enter the second integer b: ");
        int b = sc.nextInt();

        System.out.print("Enter the third integer c: ");
        int c = sc.nextInt();

        if (a + b == c || a == b - c || a * b == c)
            System.out.println("The numbers can be used in a correct arithmetic formula");
        else
            System.out.println("The numbers cannot be used in correct arithmetic formula ");

        sc.close();
    }
}



// Enter the first integer a: 2
// Enter the second integer b: 3
// Enter the third integer c: 5
// The numbers can be used in a correct arithmetic formula