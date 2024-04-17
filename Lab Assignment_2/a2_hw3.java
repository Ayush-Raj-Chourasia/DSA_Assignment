// Create a class Bank with two instance variables: bankNname, deposi-
// tAamount and a class variable totalAamount. Defined three member
// methods: setBankName() to set the bank name, setAmount() to set the
// deposit amount, and showData() for displaying the bank name and de-
// posit amount. A person visited 5 different banks and deposite money.
// Create 5 array object of class Bank set the bank name and deposit
// amount (the minimum deposit amount is 1000) using member methods
// setBankName() and setAmount(). Call the showData() method to dis-
// play the information with totalAmount deposited by the person. Also,
// design a method that displays the bank name where the person deposits
// the minimum amount.

import java.util.*;

class Bank {
    String bankName;
    int depositAmount;
    static int totalAmount;

    public Bank() {
        this.bankName = "";
        this.depositAmount = 0;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setAmount(int depositAmount) {
        if (depositAmount >= 1000) {
            this.depositAmount = depositAmount;
        } else {
        }
        this.depositAmount = 0;
        System.out.println("Balance not credited due to low balance");
        totalAmount += this.depositAmount;
    }

    public void showData() {
        System.out.println(this.bankName + "\t" + this.depositAmount);
    }

    public int bankDetails(Bank[] b) {
        int index = 0;
        for (int i = 1; i < b.length; i++) {
            if (b[index].depositAmount > b[i].depositAmount)
                index = i;
        }
        return index;
    }
}

class a2_hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many account you want to create: ");
        int n = sc.nextInt();
        Bank b[] = new Bank[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Enter the bank name, and deposit amount(minimum amount 1000)");
            String name = sc.nextLine();
            int amount = sc.nextInt();
            b[i] = new Bank();
            b[i].setBankName(name);
            b[i].setAmount(amount);
        }
        System.out.println("*******Book information*******");
        System.out.println("Bank name \t Amount ");
        for (int i = 0; i < n; i++) {
            b[i].showData();
        }
        System.out.println("TotalAmount deposit by the person is" + Bank.totalAmount);
        int index = b[0].bankDetails(b);
        System.out.println("Bank details with minimum deposit amount ");
        b[index].showData();
        sc.close();
    }

}
