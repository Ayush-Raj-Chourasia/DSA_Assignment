// Write  a  java  program  to  print  M-by-N  array  in  the  tabular  format.  Also,  display  the  sum  of 
// elements of the array.

import java.util.Scanner;

public class a1_p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Row and Columns of 2D-Array: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        int sum = 0;
        System.out.println("Enter array elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The elements of 2D array are: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum+= arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The sum of elements of the 2D-Array is "+sum);
        sc.close();
    }
}



// Enter number of Row and Columns of 2D-Array: 
// 3
// 3
// Enter array elements:
// 1
// 2
// 3
// 2
// 3
// 4
// 3
// 4
// 5
// The elements of 2D array are:
// 1 2 3
// 2 3 4
// 3 4 5
// The sum of elements of the 2D-Array is 27