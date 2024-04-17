// In a super market each product is having minimum details like prodId, price, quantity
// that is used during the biling process. Keeping this in mind prepare a class named as
// Product having the member variables
// prodId, price, quantity
// a static variable totalPrice
// Initialize the value of product through parameterized constructor. It consists of a
// display() method to display the value of instance variables. A person went to market
// and purchase 5 different products. Using the above mentioned class, display the details
// of products that the person has purchased. Also, determine how much total amount
// the person will pay for the purchase of 5 products.

import java.util.Scanner;

class Product{
    int proId, quantity;
    double price;
    static double totalPrice;

    Product(int prodId, double price, int quantity){
        this.proId = prodId;
        this.price = price;
        this.quantity = quantity;
        totalPrice += this.price*this.quantity;
    }

    void display(){
        System.out.println(proId+"\t"+price+"\t"+quantity);
    }
}


public class a2_p3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of products: ");
        int n = sc.nextInt();
        Product ob[] = new Product[n]; // array of object refrences
        for(int i = 0; i<n; i++){
            System.out.print("Enter ProductId: ");
            int id = sc.nextInt();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();
            ob[i] = new Product(id, price, quantity);
        }
    
        System.out.println("ProductId\tPrice\tQuantity");
        for(int i = 0; i<n; i++){
            ob[i].display();
        }

        System.out.println("Total Price: "+ Product.totalPrice);
        sc.close();
    }
    
}


// Enter No. of products: 3
// Enter ProductId: 1001
// Enter Price: 20
// Enter Quantity: 2
// Enter ProductId: 1002
// Enter Price: 40
// Enter Quantity: 2
// Enter ProductId: 1003
// Enter Price: 10
// Enter Quantity: 5
// ProductId       Price   Quantity
// 1001    20.0    2
// 1002    40.0    2
// 1003    10.0    5
// Total Price: 170.0