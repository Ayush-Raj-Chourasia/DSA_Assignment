import java.util.Scanner;

class Node {
    int data;
    Node next;
}

public class DynamicQueue {

    public static Node insert(Node rear, Node front) {
        Scanner sc = new Scanner(System.in);
        Node p = new Node();
        System.out.println("Enter the data of new node: ");
        p.data = sc.nextInt();
        p.next = null;

        if (rear == null) {
            rear = p;
            front = p;
        } else {
            rear.next = p;
            rear = p;
        }
        return rear;
    }

    public static Node delete(Node rear, Node front) {
        if (front == null) {
            System.out.println("Queue underflow, delete not possible");
        } else {
            Node p = front;
            front = front.next;
            System.out.println("Deleted node info-- data value: " + p.data);
            if (front == null) {
                rear = null;
            }
        }
        return front;
    }

    public static void display(Node rear, Node front) {
        if (front == null) {
            System.out.println("Empty Queue");
        } else {
            Node p = front;
            System.out.println("Queue elements are: ");
            while (p != null) {
                System.out.print(p.data + " ");
                p = p.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node rear = null;
        Node front = null;

        while (true) {
            System.out.println("****MENU****");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    sc.close();
                    System.exit(0);
                case 1:
                    rear = insert(rear, front);
                    if (front == null) front = rear; // Update front if it was null
                    break;
                case 2:
                    front = delete(rear, front);
                    if (front == null) rear = null; // Update rear if the queue becomes empty
                    break;
                case 3:
                    display(rear, front);
                    break;
                default:
                    System.out.println("Wrong choice, try again");
            }
        }
    }
}
