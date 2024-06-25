package Practical.Set_B;

// Write a Java programme to create an integer queue insert 5 element used insert(),traverse() method

public class IntegerQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int maxSize;
    private int currentSize;


    public IntegerQueue(int size) {
        queue = new int[size];
        maxSize = size;
        front = 0;
        rear = -1;
        currentSize = 0;
    }


    public void insert(int value) {
        if (currentSize == maxSize) {
            System.out.println("Queue is full. Cannot insert " + value);
        } else {
            rear = (rear + 1) % maxSize;
            queue[rear] = value;
            currentSize++;
            System.out.println("Inserted " + value + " into the queue.");
        }
    }

   
    public void traverse() {
        if (currentSize == 0) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue elements:");
            for (int i = 0; i < currentSize; i++) {
                System.out.println(queue[(front + i) % maxSize]);
            }
        }
    }


    public static void main(String[] args) {
        IntegerQueue queue = new IntegerQueue(5);


        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);

  
        queue.traverse();
    }
}

