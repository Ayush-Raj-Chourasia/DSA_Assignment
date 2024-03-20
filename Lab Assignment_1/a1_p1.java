// Write a Java program that can take a positive integer greater than 2 as input and write out the 
// number  of  times  one  must  repeatedly  divide  this  number  by  2  before  getting  a  value  less 
// than 2.



import java.util.Scanner;

public class a1_p1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("The positive integer greater than 2 from command line argument is ");
		int n = sc.nextInt();
		int count = 0;
		if (n>=2){
		    while(n>2){
		        n = n/2;
		        count ++;	        
		        }
		    }
		System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is "+ count);
		sc.close();
	}
}



// The positive integer greater than 2 from command line argument is 67
// The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is 5