package Practical.Set_A;

// Write a job prayer to create a stack using linked list. Push 5 element and display it. Uae push(), traverse()

public class LinkedListStack {
    
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

 
    public LinkedListStack() {
        this.top = null;
    }


    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed " + value + " onto the stack.");
    }

  
    public void traverse() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            Node current = top;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);


        stack.traverse();
    }
}
