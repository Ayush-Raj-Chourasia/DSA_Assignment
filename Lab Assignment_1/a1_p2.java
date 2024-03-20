// Write a java program by using conditional statement to show the category for a given BMI. 

import java.util.Scanner;

public class a1_p2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter person Weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height of person in meter: ");
        double height = sc.nextDouble();
        String result = "";
        double bmi = weight/(Math.pow(height,2));
        if (bmi<18.5)
            result = "Underweight";
        else if (bmi >=18.5 && bmi <= 24.9)
            result = "Normal Weight";
        else if (bmi >=25.0 && bmi <= 29.9)
            result = "Overweight";
        else
            result = "Obese";
        System.out.println("The person is "+result);
        sc.close();
    }
    
}


// Enter person Weight in kg: 68
// Enter height of person in meter: 2
// The person is Underweight


// Enter person Weight in kg: 96
// Enter height of person in meter: 1.4
// The person is Obese