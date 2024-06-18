import java.util.Scanner;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
    protected Node prev;
}

public class DLinkedList {
    static Node start = null;
    static Node end = null;

    public static Node create(Node start, Node end) {
        Scanner sc = new Scanner(System.in);
        Node p;
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
                end = p;
                p.prev = null;
            } else {
                p.prev = end;
                end.next = p;
                end = p;
            }
            System.out.println("Do you want to create more nodes (y/n)?");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
        return end;
    }

    public static void display(Node start, Node end) {
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

    public static Node insBeg(Node start, Node end) {
        Scanner sc = new Scanner(System.in);
        Node p = new Node();
        System.out.println("Enter registration number: ");
        p.regd_no = sc.nextInt();
        System.out.println("Enter marks: ");
        p.mark = sc.nextFloat();
        p.prev = null;
        if (start == null) {
            p.next = null;
            start = p;
            end = p;
        } else {
            start.prev = p;
            p.next = start;
            start = p;
        }
        return start;
    }

    public static Node insEnd(Node start, Node end) {
        Scanner sc = new Scanner(System.in);
        Node p = new Node();
        System.out.println("Enter registration number: ");
        p.regd_no = sc.nextInt();
        System.out.println("Enter marks: ");
        p.mark = sc.nextFloat();
        p.next = null;
        if (start == null) {
            p.prev = null;
            start = p;
            end = p;
        } else {
            p.prev = end;
            end.next = p;
            end = p;
        }
        return end;
    }

    public static Node insAny(Node start, Node end) {
        Scanner sc = new Scanner(System.in);
        Node p = new Node();
        System.out.println("Enter the registration number of new node: ");
        p.regd_no = sc.nextInt();
        System.out.println("Enter the marks: ");
        p.mark = sc.nextFloat();
        System.out.println("Enter position of new node: ");
        int pos = sc.nextInt();
        if (pos <= 0) {
            System.out.println("Position does not exist in linked list.");
            return start;
        } else if (start == null) {
            p.next = null;
            p.prev = null;
            start = p;
            end = p;
            System.out.println("Node added at first position.");
        } else if (pos == 1) {
            p.next = start;
            p.prev = null;
            start.prev = p;
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
                p.prev = q;
                end = p;
                System.out.println("Position not found, so new Node added at last position.");
            } else {
                p.next = q.next;
                p.prev = q;
                q.next.prev = p;
                q.next = p;
                System.out.println("New node added at position " + pos);
            }
        }
        return start;
    }

    public static Node delBeg(Node start, Node end) {
        if (start == null) {
            System.out.println("Empty linked list");
        } else if (start.next == null) {
            Node p = start;
            start = null;
            end = null;
            System.out.println("Deleted node information\nReg.no--- marks");
            System.out.println(p.regd_no + "--------- " + p.mark);
        } else {
            Node p = start;
            start = start.next;
            start.prev = null;
            System.out.println("Deleted node information\nReg.no--- marks");
            System.out.println(p.regd_no + "--------- " + p.mark);
        }
        return start;
    }

    public static Node delEnd(Node start, Node end) {
        if (start == null) {
            System.out.println("Empty linked list");
        } else if (start.next == null) {
            Node p = start;
            start = null;
            end = null;
            System.out.println("Deleted node information\nReg.no--- marks");
            System.out.println(p.regd_no + "--------- " + p.mark);
        } else {
            Node p = end;
            end = end.prev;
            end.next = null;
            System.out.println("Deleted node information\nReg.no--- marks");
            System.out.println(p.regd_no + "--------- " + p.mark);
        }
        return end;
    }

    public static Node delAny(Node start, Node end) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position of node to be deleted: ");
        int pos = sc.nextInt();
        if (start == null) {
            System.out.println("Empty linked list, delete not possible");
        } else if (pos == 1 && start.next == null) {
            Node q = start;
            start = null;
            end = null;
            System.out.println("Deleted node info-- registration no: " + q.regd_no + " and mark: " + q.mark);
        } else if (pos == 1) {
            Node q = start;
            start = start.next;
            start.prev = null;
            System.out.println("Deleted node info-- registration no: " + q.regd_no + " and mark: " + q.mark);
        } else {
            Node q = start;
            Node p = start;
            for (int i = 1; i < pos && p.next != null; i++) {
                q = p;
                p = p.next;
            }
            if (p.next == null) {
                System.out.println("Position not found, delete not possible ");
            } else {
                System.out.println("Deleted node info-- registration no: " + p.regd_no + " and mark: " + p.mark);
                if (p.next == null) {
                    q.next = null;
                    end = q;
                } else {
                    p.next.prev = q;
                    q.next = p.next;
                }
            }
        }
        return start;
    }

    public static void search(Node start) {
        Scanner sc = new Scanner(System.in);
        if (start == null) {
            System.out.println("Empty linked list");
        } else {
            System.out.println("Enter registration number to search: ");
            int regNo = sc.nextInt();
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

    public static void count(Node start) {
        int c = 0;
        Node q = start;
        while (q != null) {
            c++;
            q = q.next;
        }
        System.out.println("Number of nodes present in linked list is " + c);
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
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    end = create(start, end);
                    break;
                case 2:
                    display(start, end);
                    break;
                case 3:
                    start = insBeg(start, end);
                    break;
                case 4:
                    end = insEnd(start, end);
                    break;
                case 5:
                    start = insAny(start, end);
                    break;
                case 6:
                    start = delBeg(start, end);
                    break;
                case 7:
                    end = delEnd(start, end);
                    break;
                case 8:
                    start = delAny(start, end);
                    break;
                case 9:
                    search(start);
                    break;
                case 10:
                    count(start);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
