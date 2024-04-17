// Define a base class Person with instance variable name, age. The instance variables
// are initialized through constructors. The prototype of constructor is as below.
// Person (string, int)
// Define a derived class Employee with instance variables Eid, salary. The instance
// variables are initialized through constructors. The prototype of constructor is as below.
// Employee (string, int, int, double).
// Another instance method of Employee class is empDisplay() to display the information
// of employee details.

import java.util.Scanner;

class Person1 {
    String name;
    int age;

    Person1(String name, int age) {
        this.name = name;
        this.age = age;

    }
}

class Employee extends Person1 {
    int Eid;
    double salary;

    Employee(String name, int age, int Eid, double salary) {
        super(name, age);
        this.Eid = Eid;
        this.salary = salary;
    }

    void empDisplay() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: "+this.age);
        System.out.println("EmployeeId: "+ this.Eid);
        System.out.println("Salary: "+ this.salary);
    }
}

public class a2_p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter EmployeeId: ");
        int Eid = sc.nextInt();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        Employee ob = new Employee(name, age, Eid, salary);
        ob.empDisplay();
        sc.close();

    }

}



// Enter Name: Hello
// Enter age: 20
// Enter EmployeeId: 100001
// Enter Salary: 200000
// Name: Hello
// Age: 20
// EmployeeId: 100001
// Salary: 200000.0