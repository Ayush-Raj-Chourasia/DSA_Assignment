import java.util.Scanner;

class Node {
    int info;
    Node next;
}

public class DynamicStack {

    public static Node push(Node top) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to push: ");
        int data = sc.nextInt();
        Node node = new Node();
        node.info = data;
        node.next = top;
        top = node;
        System.out.println("Element pushed: " + data);
        return top;
    }

    public static Node pop(Node top) {
        if (top == null) {
            System.out.println("Stack underflow, delete not possible");
        } else {
            System.out.println("Element popped: " + top.info);
            top = top.next;
        }
        return top;
    }

    public static void display(Node top) {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            Node temp = top;
            System.out.println("Stack elements are: ");
            while (temp != null) {
                System.out.print(temp.info + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node top = null;

        while (true) {
            System.out.println("****MENU****");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    top = push(top);
                    break;
                case 2:
                    top = pop(top);
                    break;
                case 3:
                    display(top);
                    break;
                default:
                    System.out.println("Wrong choice, try again");
            }
            
        }
    }
}
