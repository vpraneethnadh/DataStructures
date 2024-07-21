class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedListLength {
    static node head;
    static node tail;
    static int len;

    public static void insert(int n) {
        node newNode = new node(n);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        len ++;
    }

    public static void printdata() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("Null");
    }

    public static void main(String args[]) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        insert(60);
        printdata();

        System.out.println("Total number of nodes are: " + len);
    }
}
