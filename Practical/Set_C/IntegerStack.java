package Practical.Set_C;


// Write a Java programme to create an integer stack using array, whose five elements and display it and call it from the main method
public class IntegerStack {
    private int[] stack;
    private int top;
    private int maxSize;

    public IntegerStack(int size) {
        stack = new int[size];
        maxSize = size;
        top = -1;
    }
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stack[++top] = value;
            System.out.println("Pushed " + value + " onto the stack.");
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; 
        } else {
            int value = stack[top--];
            System.out.println("Popped " + value + " from the stack.");
            return value;
        }
    }


    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack(5);


        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.display();

        stack.pop();
        stack.pop();
        stack.display();
    }
}
