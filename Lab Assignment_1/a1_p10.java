// Write a method that returns the sum of all the elements in a specified column in a matrix 
// using the following header: 
 
// public static double sumColumn(double[][] m, int columnIndex) 
 
// Write a java program that reads a 3-by-4 matrix and displays the sum of each column.

import java.util.Scanner;
public class a1_p10 {

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Row and Columns of 2D-Array: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        double arr[][] = new double[row][col];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }
        System.out.println("The elements of 2D array are: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        for (int j = 0; j < col; j++) {
            System.out.println("Sum of the elements at column " + j + " is " + sumColumn(arr, j));
        }
        sc.close();
    }

}




// Enter number of Row and Columns of 2D-Array: 
// 3
// 4
// Enter array elements:
// 1.5
// 2
// 3
// 4
// 5.5
// 6
// 7
// 8
// 9.5
// 1
// 3
// 1
// The elements of 2D array are:
// 1.5     2.0     3.0     4.0
// 5.5     6.0     7.0     8.0
// 9.5     1.0     3.0     1.0
// Sum of the elements at column 0 is 16.5
// Sum of the elements at column 1 is 9.0
// Sum of the elements at column 2 is 13.0
// Sum of the elements at column 3 is 13.0
