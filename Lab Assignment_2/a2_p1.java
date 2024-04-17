// Define a class Person with two instance variables:
// name and age
// and two member methods:
// setData(): set the details of the person.
// displayData(): display the details of the person.
// Now, create two objects of class person and initialize one object value directly (by using the dot(.) operator name: “Rohan” and age: 20). Accept your name and age
// through the keyboard and set them to another object using the setData() method.
// Now display both the member variables using the displayData() method. Also, check who is younger.



import java.util.*;

class person{
	   String name;
	   int age;

	   public void setData(){
		   Scanner sc = new Scanner(System.in);
		   System.out.print("Enter name: ");
		   this.name=sc.nextLine();
		   System.out.print("Enter Age: ");
		   this.age=sc.nextInt();
                   sc.close();
	   }
	   public void displayData()
	   {
		   System.out.println(this.name+"\t"+this.age);

	   }
}


public class a2_p1 {
	public static void main(String[] args) {

        person ob1 = new person();
        person ob2 = new person();
        ob1.name = "Rohan";
        ob1.age = 20;
        ob2.setData();
        System.out.println("Personal information- \nName:  \tAge:");
        ob1.displayData();
        ob2.displayData();
        if(ob1.age<ob2.age)
        	System.out.println(ob1.name+" is younger than "+ob2.name);
        else
        	System.out.println(ob2.name+" is younger than "+ob1.name);
	}
}


