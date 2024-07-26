class node {
    int data;
    node next;
    node(int data) {
        this.data = data;
        next = null;
    }
}

public class RemoveKthELement {
    static node head;
    static node tail;
    static int len = 0;

    public static void insert(int n) {
        node temp = new node(n);
        if (head == null)
            head = temp;
        else {
            tail = head;
            while (tail.next != null)
                tail = tail.next;
            tail.next = temp;
        }
        len++;
    }

    public static void removeEveryKthElement(int k) {
        if (k <= 0) {
            System.out.println("Enter a valid value for k");
            return;
        }
        node prev = null;
        int index = 1;
        tail = head;
        while (tail != null) {
            if (index % k == 0) {
                if (prev == null) {
                    head = tail.next;
                } else {
                    prev.next = tail.next;
                }
                len--;
            } else {
                prev = tail;
            }
            tail = tail.next;
            index ++;
        }
    }

    public static void printData() {
        if (head == null)
            System.out.println("No Data Found!");
        else {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println("Null");
        }
    }

    public static void main(String args[]) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        insert(60);
        insert(70);
        insert(80);
        insert(90);
        insert(100);
        printData();

        removeEveryKthElement(3);
        printData();
    }
}
