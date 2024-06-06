// Write a recursive Java method that takes a character string s and outputs its  reverse. For 
// example, the reverse of 'pots&pans' would be 'snap&stop'.

import java.util.Scanner;

public class a3_hw5 {
    
    public static String reverseString(String s, int index){
        if(index<s.length())
            return reverseString(s, index+1)+s.charAt(index);
        else
            return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("Reverse String: "+reverseString(s, 0));
        sc.close();
    }
}
 


// Enter string: hello
// Reverse String: olleh


// reverseString("hello", 0) calls reverseString("hello", 1) and waits.
// reverseString("hello", 1) calls reverseString("hello", 2) and waits.
// reverseString("hello", 2) calls reverseString("hello", 3) and waits.
// reverseString("hello", 3) calls reverseString("hello", 4) and waits.
// reverseString("hello", 4) calls reverseString("hello", 5) and waits.
// reverseString("hello", 5) returns "".
// reverseString("hello", 4) returns "o".
// reverseString("hello", 3) returns "ol".
// reverseString("hello", 2) returns "oll".
// reverseString("hello", 1) returns "olle".
// reverseString("hello", 0) returns "olleh".