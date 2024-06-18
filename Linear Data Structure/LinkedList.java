
import java.util.Scanner;

public class LinkedList {

    private static Node head = null;
    private static int size = 0;
    private static Scanner sc = new Scanner(System.in);

    // Node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    // Traverse Linked List
    public void traverse() {
        Node temp;

        if (head == null)
            System.out.println("Linked List is empty");
        else {
            temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    // Length of linked list
    public int length() {
        int count = 0;
        Node temp;
        if (head == null)
            return 0;
        else {
            temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
        }
        return count;
    }

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    // Insert at any position
    public void insertAtPosition(int data, int position) {
        if (position <= 0 || position > size) {
            System.out.println("Invalid Postion");
            return;
        }

        else if (position == 1)
            insertAtBeginning(data);

        else {
            Node newNode = new Node(data);
            Node temp = head;
            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    // Delete from beginning
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        }
        Node temp;
        temp = head;
        head = head.next;
        temp.next = null;
        size--;
        System.out.println("Deleted Node: " + temp.data);
    }

    // Delete from end
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            size--;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }

    // Delete from any position
    public void deleteFromPosition(int position) {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        if (position <= 0 || position > size) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            deleteFromBeginning();
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }


    public boolean search(int data){
        Node current = head;
        while(current != null){
            if(current.data == data)
                return true;
            
            current = current.next;
        }
        return false;
    }

    // Reverse 
    public void reverse(){
        Node current = head;
        Node prev = null;
        Node next = null;
        while(current != null){
            next = current.next; // Store next
            current.next = prev; // Reverse current node's pointer
            prev = current;      // Move pointers one position ahead
            current = next;
        }
        head = prev;
    }

    public void sort() {
        head = mergeSort(head);
    }

    private Node mergeSort(Node head) {
        // Base case: if the list is empty or has only one element
        if (head == null || head.next == null) {
            return head;
        }

        // Split the list into two halves
        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;

        middle.next = null;

        // Apply mergeSort on both halves
        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        // Merge the sorted halves
        Node sortedList = sortedMerge(left, right);
        return sortedList;
    }

    // Method to merge two sorted linked lists
    private Node sortedMerge(Node left, Node right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        Node result;
        if (left.data <= right.data) {
            result = left;
            result.next = sortedMerge(left.next, right);
        } else {
            result = right;
            result.next = sortedMerge(left, right.next);
        }
        return result;
    }

    // Method to get the middle of the linked list
    private Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtBeginning(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(40);
        ll.insertAtPosition(30, 3);
        // 10->20->40->null
        // 10->20->30->40->null
        // 4
        ll.traverse();
        ll.deleteFromBeginning();
        ll.deleteFromEnd();
        ll.traverse();
        System.out.println(ll.length());
        System.out.println(size);
        ll.insertAtBeginning(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(40);
        ll.insertAtPosition(30, 3);
        ll.traverse();
        ll.deleteFromBeginning();
        ll.deleteFromEnd();
        ll.traverse();
        System.out.println("Length of linked list: " + ll.length());
        System.out.println("Searching 20 in linked list: " + ll.search(20));
        ll.reverse();
        System.out.println("Reversed Linked List:");
        ll.traverse();
        ll.sort();
        System.out.println("Sorted Linked List:");
        ll.traverse();
        sc.close();
    }

}

// Methods of Node
// create
// insertAtBeginning
// insertAtEnd
// insertAtPosition
// deleteFromBeginning
// deleteFromEnd
// deleteFromPosition
// traverse/display
// count/length
// search
// reverse
// sort

