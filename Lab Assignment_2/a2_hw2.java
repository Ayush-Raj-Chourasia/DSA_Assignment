// Define a class called Book with instance variables BName, BEdition,
// BPrice. Use constructor to initialize the instance variables of the class.
// Another instance method display ( ) to display the book information. A
// person purchase 5 different books. Display the book details which has
// the maximum price

import java.util.*;

class Book {
    String BName, BEdition;
    int BPrice;

    public Book(String BName, String BEdition, int BPrice) {
        this.BName = BName;
        this.BEdition = BEdition;
        this.BPrice = BPrice;
    }

    public void display() {
        System.out.println(this.BName + "\t" + this.BEdition + "\t" + this.BPrice);
    }
}

public class a2_hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many book you want to buy: ");
        int n = sc.nextInt();
        Book b[] = new Book[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Enter the book name, edition, and price ");
            String name = sc.nextLine();
            String edition = sc.nextLine();
            int price = sc.nextInt();
            b[i] = new Book(name, edition, price);
        }
        System.out.println("*******Book information*******");
        System.out.println("Book name \t edition \t price ");
        for (int i = 0; i < n; i++) {

            b[i].display();
        }
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (b[index].BPrice < b[i].BPrice)
                index = i;
        }
        System.out.println("Book details with highest price ");
        b[index].display();
        sc.close();
    }
}


// How many book you want to buy: 2
// Enter the book name, edition, and price 
// Calculus
// 8
// 1000
// Enter the book name, edition, and price
// Physics
// 7
// 1500
// *******Book information*******
// Book name        edition         price
// Calculus        8       1000
// Physics 7       1500
// Book details with highest price
// Physics 7       1500