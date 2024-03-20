// Write a method to add two matrices. The header of the method is as follows: 
 
// public static double[][] addMatrix(double[][] a, double[][] b)  
// In  order  to  be  added,  the  two  matrices  must  have  the  same  dimensions  and  the  same  or compatible types of elements.



import java.util.Scanner;

public class a1_hw4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of row and column: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        double[][] x = new double[m][n];
        double[][] y = new double[m][n];
        double[][] z = new double[m][n];

        System.out.println("Enter elements of the first matrix: ");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                x[i][j] = sc.nextDouble();

        System.out.println("Enter elements of the second matrix: ");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                y[i][j] = sc.nextDouble();

        z = addMatrix(x, y);

        System.out.println("The addition of the two arrays is: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(z[i][j] + "\t");
            System.out.println();
        }

        sc.close();
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        int row = a.length;
        int column = a[0].length;
        double[][] sum = new double[row][column];

        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                sum[i][j] = a[i][j] + b[i][j];

        return sum;
    }
}


// Enter length of row and column: 
// 3
// 3
// Enter elements of the first matrix: 
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// Enter elements of the second matrix:
// 1
// 3
// 4
// 2
// 5
// 6
// 4
// 9
// 8
// The addition of the two arrays is:
// 2.0     5.0     7.0
// 6.0     10.0    12.0
// 11.0    17.0    17.0