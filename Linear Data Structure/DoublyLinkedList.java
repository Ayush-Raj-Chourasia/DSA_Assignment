public class DoublyLinkedList {
    private Node head;
    private int size;

    // Node class
    private class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Constructor to create an empty list
    public DoublyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Traverse/Display
    public void traverse() {
        Node temp = head;
        if (temp == null) {
            System.out.println("Doubly Linked List is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Length of linked list
    public int length() {
        return size;
    }

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
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
            newNode.prev = temp;
        }
        size++;
    }

    // Insert at any position
    public void insertAtPosition(int data, int position) {
        if (position <= 0 || position > size + 1) {
            System.out.println("Invalid Position");
            return;
        }
        if (position == 1) {
            insertAtBeginning(data);
        } else if (position == size + 1) {
            insertAtEnd(data);
        } else {
            Node newNode = new Node(data);
            Node temp = head;
            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            newNode.prev = temp;
            if (temp.next != null) {
                temp.next.prev = newNode;
            }
            temp.next = newNode;
            size++;
        }
    }

    // Delete from beginning
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("Doubly Linked List is Empty");
            return;
        }
        Node temp = head;
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        System.out.println("Deleted Node: " + temp.data);
        size--;
    }

    // Delete from end
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("Doubly Linked List is empty");
            return;
        }
        if (head.next == null) {
            System.out.println("Deleted Node: " + head.data);
            head = null;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            System.out.println("Deleted Node: " + temp.data);
            temp.prev.next = null;
        }
        size--;
    }

    // Delete from any position
    public void deleteFromPosition(int position) {
        if (head == null) {
            System.out.println("Doubly Linked List is empty");
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
        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }
        System.out.println("Deleted Node: " + temp.data);
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        size--;
    }

    // Search in linked list
    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtBeginning(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(40);
        dll.insertAtPosition(30, 3);
        dll.traverse(); // 10 <-> 20 <-> 30 <-> 40 <-> null
        dll.deleteFromBeginning();
        dll.deleteFromEnd();
        dll.traverse(); // 20 <-> 30 <-> null
        System.out.println("Length of linked list: " + dll.length()); // 2
        System.out.println("Searching 20 in linked list: " + dll.search(20)); // true
        System.out.println("Searching 50 in linked list: " + dll.search(50)); // false
        dll.deleteFromPosition(2);
        dll.traverse(); // 20 <-> null
    }
}
