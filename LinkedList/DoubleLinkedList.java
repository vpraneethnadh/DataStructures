class node {
    int data;
    node next;
    node prev;

    node(int data) {
        this.data = data;
        next = prev = null;
    }
}

class DoubleLinkedList {
    static node head;
    static node tail;

    public static void insertatbeg(int n) {
        node temp = new node(n);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    public static void insertatend(int n) {
        node temp = new node(n);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    public static void insertatpos(int n, int pos) {
        if (pos <= 0) {
            System.out.println("Check the position given!");
            return;
        }
        node temp = new node(n);
        if (pos == 1) {
            insertatbeg(n);
            return;
        }
        node current = head;
        for (int i = 1; i < pos - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            insertatend(n);
        } else {
            temp.next = current.next;
            temp.prev = current;
            current.next.prev = temp;
            current.next = temp;
        }
    }

    public static void deleteatbeg() {
        if (head == null) {
            System.out.println("No links found!");
        } else {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        }
    }

    public static void deleteatend() {
        if (head == null) {
            System.out.println("No links found!");
        } else if (head.next == null) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public static void deleteatpos(int pos) {
        if (head == null) 
            System.out.println("No links found!");
        else if (pos <= 0)
            System.out.println("Enter correct position!");
        else if (pos == 1) 
            deleteatbeg();
        else {
            tail = head;
            while(pos > 2){
                tail = tail.next;
                pos --;
            }
            tail.next = tail.next.next;
            tail.next.prev = tail;
        }
    }

    public static void sort() {
        if (head == null) return;

        boolean swapped = true;
        while (swapped) {
            swapped = false;
            node current = head;
            while (current.next != null) {
                if (current.data > current.next.data) {
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        }
    }

    public static void display() {
        node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        insertatbeg(30);
        insertatbeg(20);
        insertatbeg(10);
        insertatbeg(70);
        display();

        insertatend(40);
        insertatend(50);
        insertatend(60);
        insertatend(5);
        display();

        insertatpos(25, 3);
        display();

        deleteatbeg();
        display();

        deleteatend();
        display();

        deleteatpos(2);
        display();

        sort();
        display();
    }
}