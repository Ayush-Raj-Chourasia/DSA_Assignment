// Write  a  Java  program  to  read  your  lucky  number  from keyboard.  Treat  –ve  no.  as
// NumberFormatException. Write appropriate Exceptional handler.


import java.util.*;;
public class a3_p1 {
	int x;
	public void input(int x)
	{
		this.x=x;
		if(x<0) 
			throw new NumberFormatException("You entered negative number ");
		else
			System.out.println("Your lucky Number: "+x);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0;
		System.out.print("Enter your lucky number: ");
		n=sc.nextInt();
		a3_p1 ob=new a3_p1();
		try 
		{	
			ob.input(n);
		}
		catch(Exception e)
		{
			System.out.println("Error "+ e);
		}
		sc.close();
	}
}

// Enter your lucky number: -4
// Error java.lang.NumberFormatException: You entered negative number