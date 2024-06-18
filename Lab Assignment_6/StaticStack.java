import java.util.Scanner;

public class StaticStack {
    public static final int MAX = 10;
    
    public static int push(int S[], int top) {
        Scanner sc = new Scanner(System.in);
        if (isFull(top)) {
            System.out.println("Stack Overflow, insertion not possible");
        } else {
            System.out.println("Enter an element to push: ");
            int element = sc.nextInt();
            S[++top] = element;
            System.out.println("Element pushed: " + element);
        }
        sc.close();
        return top;
    }

    public static int pop(int S[], int top) {
        if (isEmpty(top)) {
            System.out.println("Stack Underflow, deletion not possible");
        } else {
            System.out.println("Element popped: " + S[top--]);
        }
        return top;
    }

    public static void display(int S[], int top) {
        if (isEmpty(top)) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements are: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(S[i] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isEmpty(int top) {
        return top == -1;
    }

    public static boolean isFull(int top) {
        return top == MAX - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stack[] = new int[MAX];
        int top = -1;

        while (true) {
            System.out.println("***MENU***");
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
                    top = push(stack, top);
                    break;
                case 2:
                    top = pop(stack, top);
                    break;
                case 3:
                    display(stack, top);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            sc.close();
        }
    }
}
