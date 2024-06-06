// Write a recursive Java method that determines if a string s is a palindrome, that is, it is 
// equal to its reverse. Examples of palindromes include 'racecar'and 
// 'gohangasalamiimalasagnahog'.

import java.util.Scanner;

public class a3_hw6 {
    public static String reverseString(String s, int index){
        if(index<s.length())
            return reverseString(s, index+1)+s.charAt(index);
        else
            return "";
    }

    public static void isPalindrome(String s){
        if(s.equals(reverseString(s, 0)))
            System.out.println("Palindrome String");
        else
            System.out.println("Not Palindrome String");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        isPalindrome(s);
        sc.close();
    }
}


// Enter string: racecar
// Palindrome String