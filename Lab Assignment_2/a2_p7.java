// Define an interface DetailInfo to declare methods display( ) & count( ). Another class
// Person contains a static data member maxcount, instance member name & method
// display( ) to display name of a person, count the no. of characters present in the name
// of the person.

import java.util.Scanner;

interface DetailInfo{
    void display();
    void count();

}

class Person2 implements DetailInfo{
    String name;
    static int maxcount;
    Person2(String name){
        this.name = name;
    }
    
    public void count(){
        maxcount = this.name.length();
    }

    public void display(){
        System.out.println("Name: "+ this.name);
        System.out.println("Length of name: "+ maxcount);
    }
}
 
public class a2_p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        Person2 ob = new Person2(name);
        ob.count();
        ob.display();
        sc.close();
    }
    
}


// Enter name: Hello
// Name: Hello
// Length of name: 5