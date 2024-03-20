public class Student {
    int roll;
    String name;

    void test(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        // Creating object of Student class
        Student student1 = new Student();
        Student student2 = new Student();

        student1.test(101, "User_1");
        student2.test(102, "User_2");

        System.out.println("Student 1 details: ");
        student1.display();

        System.out.println("\nStudent 2 details: ");
        student2.display();
    }
}


// Output:
// Student 1 details: 
// Roll: 101
// Name: User_1

// Student 2 details: 
// Roll: 102
// Name: User_2