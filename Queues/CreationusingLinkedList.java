class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        next = null;
    }
}

public class CreationusingLinkedList {
    static node head;
    static node tail;
    static int size = 10;
    static int len = 0;

    public static void enqueue(int n) {
        node temp = new node(n);
        if (len >= size)
            System.out.println("Overflow");
        else {
            if (head == null)
                head = temp;
            else {
                tail = head;
                while(tail.next != null)
                    tail = tail.next;
                tail.next = temp;
            }
            len++;
        }
    }

    public static void dequeue() {
        if (len <= 0)
            System.out.println("Underflow");
        else {
            if (head == null)
                System.out.println("Queue is empty, No elements to delete");
            else {
                head = head.next;
                len--;
            }
        }
    }

    public static int peek(){
        int x = 0;
        if(head == null)
            System.out.println("Queue is empty, No elements to display");
        else{
            x = head.data;
        }
        return x;
    }

    public static int size(){
        int x = 0;
        if(head == null)
            x = 0;
        else
            x = len;
        return x;
    }

    public static boolean isEmpty(){
        if(head == null)
            return true;
        return false;
    }

    public static void printdata() {
        if (head == null)
            System.out.println("Queue is empty");
        else {
            tail = head;
            while (tail != null) {
                System.out.print(tail.data + " ");
                tail = tail.next;
            }
            System.out.println("Null");
        }
    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);
        printdata();

        dequeue();
        printdata();

        System.out.println(peek());

        System.out.println(size());

        System.out.println(isEmpty());
    }
}
