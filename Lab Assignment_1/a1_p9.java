// Write a method that sums all the numbers in the major diagonal in an n * n matrix of double 
// values using the following header: 
 
// public static double sumMajorDiagonal(double[][] m) 
 
// Write a java program that reads a 4-by-4 matrix and displays the sum of all its elements on the 
// major diagonal. 


import java.util.Scanner;
public class a1_p9 {
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of size of diagonal 2D-Array: ");
        int n = sc.nextInt();
        double arr[][] = new double[n][n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }
        System.out.println("The elements of 2D array are: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(arr));
        sc.close();
    }
}



// Enter number of size of diagonal 2D-Array: 4
// Enter array elements:
// 1
// 2
// 3
// 4.0
// 5
// 6.5
// 7
// 8
// 9
// 10
// 11
// 12
// 13
// 14
// 15
// 16
// The elements of 2D array are:
// 1.0     2.0     3.0     4.0
// 5.0     6.5     7.0     8.0
// 9.0     10.0    11.0    12.0
// 13.0    14.0    15.0    16.0
// Sum of the elements in the major diagonal is 34.5