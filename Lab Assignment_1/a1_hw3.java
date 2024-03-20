// Write  a  Java  program  that  takes  two  arrays  a  and  b  of  length  n  storing  int  values,  and  returns 
// the  dot  product  of  a  and  b.  That  is,  it  returns  an  array  c  of  length  n  such  that  c[i]  =  a[i]  ·  b[i], 
// for i = 0, . . . , n − 1.

import java.util.Scanner;

public class a1_hw3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the arrays: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        System.out.println("Enter elements of array a:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.println("Enter elements of array b:");
        for (int j = 0; j < n; j++)
            b[j] = sc.nextInt();

        System.out.print("Array c obtained by the dot product is: ");
        for (int k = 0; k < n; k++) {
            c[k] = a[k] * b[k];
            System.out.print(c[k] + " ");
        }

        sc.close();
    }
}



// Enter the length of the arrays: 5
// Enter elements of array a:
// 1
// 2
// 3
// 4
// 5
// Enter elements of array b:
// 6
// 7
// 8
// 9
// 1
// Array c obtained by the dot product is: 6 14 24 36 5