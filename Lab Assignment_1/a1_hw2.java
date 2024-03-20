// Write a Java program that takes all the lines input to standard input and writes them to standard output in reverse order. That is, each line is output in the correct order, but the ordering of the lines is reversed. 


import java.util.Scanner;
public class a1_hw2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines for input: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()

        String[] s = new String[n];

        System.out.println("Enter lines:");

        for (int i = 0; i < n; i++)
            s[i] = sc.nextLine();

        System.out.println("Lines in reverse order are:");

        for (int j = n - 1; j >= 0; j--)
            System.out.println(s[j]);

        sc.close();
    }
}



// Enter the number of lines for input: 5
// Enter lines:
// Hello world
// The sky is blue
// This is a test
// Java programming
// OpenAI language mode
// Lines in reverse order are:
// OpenAI language mode
// Java programming
// This is a test
// The sky is blue
// Hello world
