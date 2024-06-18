import java.util.Scanner;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
}

public class SingleLinkedList{
    static Node start = null;

    public static void create() {
        Scanner sc = new Scanner(System.in);
        Node p, q = null;
        char ch;
        do {
            p = new Node();
            System.out.println("Enter registration number: ");
            p.regd_no = sc.nextInt();
            System.out.println("Enter marks: ");
            p.mark = sc.nextFloat();
            p.next = null;
            if (start == null) {
                start = p;
                q = p;
            } else {
                q.next = p;
                q = p;
            }
            System.out.println("Do you want to create more nodes (y/n)?");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
    }

    public static void display() {
        Node p = start;
        if (start == null) {
            System.out.println("Empty linked list");
        } else {
            System.out.println("*******Node details*********");
            System.out.println("Reg.no--- marks");
            while (p != null) {
                System.out.println(p.regd_no + "--------- " + p.mark);
                p = p.next;
            }
        }
    }

    public static void InsBeg() {
        Scanner sc = new Scanner(System.in);
        Node p = new Node();
        System.out.println("Enter registration number: ");
        p.regd_no = sc.nextInt();
        System.out.println("Enter marks: ");
        p.mark = sc.nextFloat();
        p.next = start;
        start = p;
    }

    public static void InsEnd() {
        Scanner sc = new Scanner(System.in);
        Node p = new Node();
        System.out.println("Enter registration number: ");
        p.regd_no = sc.nextInt();
        System.out.println("Enter marks: ");
        p.mark = sc.nextFloat();
        p.next = null;
        if (start == null) {
            start = p;
        } else {
            Node q = start;
            while (q.next != null) {
                q = q.next;
            }
            q.next = p;
        }
    }

    public static void InsAny() {
        Scanner sc = new Scanner(System.in);
        Node p = new Node();
        System.out.println("Enter the registration number of new node: ");
        p.regd_no = sc.nextInt();
        System.out.println("Enter the marks: ");
        p.mark = sc.nextFloat();
        System.out.println("Enter position of new node: ");
        int pos = sc.nextInt();
        if (pos == 0) {
            System.out.println("Position does not exist in linked list.");
        } else if (start == null || pos == 1) {
            p.next = start;
            start = p;
            System.out.println("Node added at first position.");
        } else {
            Node q = start;
            for (int i = 1; i < pos - 1 && q.next != null; i++) {
                q = q.next;
            }
            if (q.next == null) {
                q.next = p;
                p.next = null;
                System.out.println("Position not found, so new Node added at last position.");
            } else {
                p.next = q.next;
                q.next = p;
                System.out.println("New node added at position " + pos);
            }
        }
    }

    public static void DelBeg() {
        if (start == null) {
            System.out.println("Empty linked list");
        } else {
            Node p = start;
            start = start.next;
            System.out.println("Deleted node information\nReg.no--- marks");
            System.out.println(p.regd_no + "--------- " + p.mark);
        }
    }

    public static void DelEnd() {
        if (start == null) {
            System.out.println("Empty linked list");
        } else {
            Node p = start;
            Node q = start;
            while (p.next != null) {
                q = p;
                p = p.next;
            }
            if (p == start) {
                start = null;
            } else {
                q.next = null;
            }
            System.out.println("Deleted node information\nReg.no--- marks");
            System.out.println(p.regd_no + "--------- " + p.mark);
        }
    }

    public static void DelAny() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position of node to be deleted: ");
        int pos = sc.nextInt();
        if (start == null) {
            System.out.println("Empty linked list, delete not possible");
        } else if (pos == 1) {
            Node q = start;
            start = start.next;
            System.out.println("Deleted node info-- registration no: " + q.regd_no + " and mark: " + q.mark);
        } else {
            Node q = start;
            Node p = start;
            for (int i = 1; i < pos && p.next != null; i++) {
                q = p;
                p = p.next;
            }
            if (p.next == null) {
                System.out.println("Position not found, delete not possible");
            } else {
                q.next = p.next;
                System.out.println("Deleted node info-- registration no: " + p.regd_no + " and mark: " + p.mark);
            }
        }
    }

    public static void search(int regNo) {
        Scanner sc = new Scanner(System.in);
        if (start == null) {
            System.out.println("Empty linked list");
        } else {
            Node p = start;
            while (p != null) {
                if (p.regd_no == regNo) {
                    System.out.println("Registration found, enter the updated marks: ");
                    p.mark = sc.nextFloat();
                    System.out.println("Marks updated");
                    return;
                }
                p = p.next;
            }
            System.out.println("Registration number not found");
        }
    }

    public static void count() {
        int c = 0;
        Node q = start;
        while (q != null) {
            c++;
            q = q.next;
        }
        System.out.println("Number of nodes present in linked list is " + c);
    }

    public static void reverse() {
        Node prev = null;
        Node current = start;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        start = prev;
        System.out.println("Linked list reversed");
    }

    public static void sort() {
        if (start == null || start.next == null) {
            return;
        }
        Node m = start;
        while (m.next != null) {
            Node q = start;
            Node p = q.next;
            while (p != null) {
                if (q.mark > p.mark) {
                    int reg = q.regd_no;
                    float mark = q.mark;
                    q.regd_no = p.regd_no;
                    q.mark = p.mark;
                    p.regd_no = reg;
                    p.mark = mark;
                }
                q = p;
                p = p.next;
            }
            m = m.next;
        }
        System.out.println("Linked list sorted based on marks");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n****MENU*****");
            System.out.println("0: Exit");
            System.out.println("1: Creation");
            System.out.println("2: Display");
            System.out.println("3: Insert new node at the beginning");
            System.out.println("4: Insert new node at the end");
            System.out.println("5: Insert new node at any position");
            System.out.println("6: Delete a node from first");
            System.out.println("7: Delete a node from last");
            System.out.println("8: Delete a node from any position");
            System.out.println("9: Update marks based on registration no.");
            System.out.println("10: Count of linked list");
            System.out.println("11: Sort the linked list based on marks");
            System.out.println("12: Reverse the linked list");
            System.out.println("Enter the choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    create();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    InsBeg();
                    break;
                case 4:
                    InsEnd();
                    break;
                case 5:
                    InsAny();
                    break;
                case 6:
                    DelBeg();
                    break;
                case 7:
                    DelEnd();
                    break;
                case 8:
                    DelAny();
                    break;
                case 9:
                    System.out.println("Enter registration no.: ");
                    int regno = sc.nextInt();
                    search(regno);
                    break;
                case 10:
                    count();
                    break;
                case 11:
                    sort();
                    break;
                case 12:
                    reverse();
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
