import java.util.Scanner;

public class StaticQueue {
    
    public static final int MAX = 5;
    public static int front = -1;
    public static int rear = -1;
    public static int[] queue = new int[MAX];

    public static void insert(int Q[]) {
        Scanner sc = new Scanner(System.in);
        if (isFull()) {
            System.out.println("Queue Overflow, Insert not possible");
        } else {
            if (front == -1) {
                front = 0;
            }
            System.out.println("Enter a data to be add: ");
            Q[++rear] = sc.nextInt();
            System.out.println("Element inserted: " + Q[rear]);
        }
    }

    public static void delete(int Q[]) {
        if (isEmpty()) {
            System.out.println("Queue underflow, delete not possible");
        } else {
            System.out.println("Deleted item is: " + Q[front]);
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
        }
    }

    public static void display(int Q[]) {
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Queue elements are: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(Q[i] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isFull() {
        return rear == MAX - 1;
    }

    public static boolean isEmpty() {
        return front == -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] queue = new int[MAX];

        while (true) {
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    sc.close();
                    System.exit(0);
                case 1:
                    insert(queue);
                    break;
                case 2:
                    delete(queue);
                    break;
                case 3:
                    display(queue);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
