// Create an abstract class Marks with three instance variables (markICP, markDSA,
// and percentage) and an abstract method getPercentage(). Create two classes: CSE
// with instance variable algoDesign, and NonCSE with instance variable enggMechan-
// ics. Both classes inherit the abstract class Marks and override the abstract method
// getPercentage(). The constructor of class CSE takes the marks in three subjects
// (markICP, markDSA, and algoDesign) as its parameters, and the constructor of class
// NonCSE takes the marks in three subjects (markICP, markDSA, and enggMechanics)
// as its parameters. Create an object for each of the two classes and print the percentage
// of marks for both students.

import java.util.Scanner;

abstract class Marks{
    int markICP, markDSA;
    double percentage;

    abstract void getPercentage();

}

class CSE extends Marks{
    int algoDesign;

    CSE(int markICP, int markDSA, int algoDesign){
        this.markICP = markICP;
        this.markDSA = markDSA;
        this.algoDesign = algoDesign;

    }

    void getPercentage(){
        this.percentage = (markICP + markDSA + algoDesign) / 3.0;
        System.out.println("Percentage for CSE student: "+ percentage+" %");
    }
}

class NonCSE extends Marks {
    int enggMechanics;

    NonCSE(int markICP, int markDSA, int enggMechanics) {
        this.markICP = markICP;
        this.markDSA = markDSA;
        this.enggMechanics = enggMechanics;
    }

    void getPercentage() {
        this.percentage = (markICP + markDSA + enggMechanics) / 3.0;
        System.out.println("Percentage for Non-CSE student: " + percentage +" %");
    }
}


public class a2_p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ICP Marks: ");
        int icp = sc.nextInt();
        System.out.print("Enter DSA Marks: ");
        int dsa = sc.nextInt();
        System.out.print("Enter Algo Marks: ");
        int algo = sc.nextInt();
        System.out.print("Enter Mechanics Marks: ");
        int mechanics = sc.nextInt();
        CSE ob1 = new CSE(icp, dsa, algo);
        NonCSE ob2 = new NonCSE(icp, dsa, mechanics);
        ob1.getPercentage();
        ob2.getPercentage();
        sc.close();
    }
    
}



// Enter ICP Marks: 90
// Enter DSA Marks: 89
// Enter Algo Marks: 80
// Enter Mechanics Marks: 98
// Percentage for CSE student: 86.33333333333333 %
// Percentage for Non-CSE student: 92.33333333333333 %