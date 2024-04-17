// A sales person is paid commission based on the sales he makes as shown
// by the following table:
// SALES COMMISSION
// Under Rs. 100 2% of SALES
// Rs 500 and under Rs 5000 5% of Sales
// Rs 5000 and above 8% of sales
// Write a class, Commission, which has:
// An instance variable, sales; an appropriate constructor; and a method,
// getCommission() that returns the commission.
// Now write a Demo class in Java to test the Commission class by read-
// ing a sale from the user, using it to create a Commission object after
// validating that the value is not negative. Finally, call the getcommis-
// sion() method to get and print the commission.
// If the sales are negative, your Demo class should print the message
// “Invalid Input”.

import java.util.*;

class Commission {
    int sales;
    public Commission(int sales){
        this.sales = sales;
    }

    public double getCommission() {
        if (this.sales <= 100)
            return this.sales * 0.02;
        else if (this.sales > 100 && this.sales <= 5000)
            return this.sales * 0.05;
        else
            return this.sales * 0.08;
    }
}

public class a2_hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sales amount: ");
        int sales = sc.nextInt();
        Commission C = new Commission(sales);
        double com = C.getCommission();
        if (com < 0)
            System.out.println("Invalid Input");
        else
            System.out.println("Commission: " + com);
        sc.close();
    }
}

// Enter the sales amount: 1000
// Commission: 50.0