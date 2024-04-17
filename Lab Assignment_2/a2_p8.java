// Design a package that contains two classes Student & Test. The Student class has
// data members as name, roll and instance methods inputDetails() & showDetails().
// Similarly the Test class has data members as mark1, mark2 and instance methods
// inputDetails(), showDetails(), Student is extended by Test. Another package carry
// interface Sports with 2 attributes score1, score2. Find grand total mark & score in
// another class.

import java.util.Scanner;

import sport.Sports;
import school.*;


public class a2_p8 extends Test implements Sports {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String n = sc.nextLine();
        System.out.print("Roll No. : ");
        int r = sc.nextInt();
        System.out.print("Enter Mark 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter Mark 2: ");
        int m2 = sc.nextInt();
        Test ob = new Test();
        ob.inputDetails(n, r , m1, m2);
        ob.showDetails();
        System.out.println("Total marks: "+ (ob.mark1 +ob.mark2));
        System.out.println("Score 1: "+score1);
        System.out.println("Score 2: "+score2);
        sc.close();
     }
}

// Enter Name: Hello
// Roll No. : 10
// Enter Mark 1: 90
// Enter Mark 2: 98
// Name: Hello
// Roll No. : 10
// Marks 1 : 90
// Marks 2 : 98
// Total marks: 188
// Score 1: 100
// Score 2: 200