class node {
    int data;
    node next;
    
    node(int data) {
        this.data = data;
        next = null;
    }
}

class SingleLinkedList {
    static node Head;
    
    public static void insertatbeg(int n) {
        node temp = new node(n);
        if (Head == null) {
            Head = temp;
        } else {
            temp.next = Head;
            Head = temp;
        }
    }
    
    public static void insertatend(int n) {
        node temp = new node(n);
        if (Head == null) {
            Head = temp;
        } else {
            node tail = Head;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = temp;
        }
    }
    
    public static void insertatpos(int n, int pos) {
        node temp = new node(n);
        if (Head == null) {
            Head = temp;
        }
        if (pos <= 0)
            System.out.println("Check the given position!");
        else if (pos == 1)
            insertatbeg(n);
        else {
            node tail = Head;
            while (pos > 2 && tail.next != null) {
                tail = tail.next;
                pos--;
            }
            temp.next = tail.next;
            tail.next = temp;
        }
    }
    
    public static void deleteatbeg() {
        if (Head == null)
            System.out.println("No Nodes Found!");
        else
            Head = Head.next;
    }
    
    public static void deleteatend() {
        if (Head == null) {
            System.out.println("No Nodes Found!");
        } else if (Head.next == null) {
            Head = null;
        } else {
            node tail = Head;
            while (tail.next.next != null) {
                tail = tail.next;
            }
            tail.next = null;
        }
    }
    
    public static void deleteatpos(int pos){
        if(pos <= 0)
            System.out.println("Enter a correct position!");
        else if(pos == 1)
            deleteatbeg();
        else{
            node tail = Head;
            while(pos > 2){
                tail = tail.next;
                pos --;
            }
            tail.next = tail.next.next;
        }
    }
    
    public static void sort() {
        if (Head == null) return;

        boolean swapped = true;
        while (swapped) {
            swapped = false;
            node tail2 = Head;
            while (tail2.next != null) {
                if (tail2.data > tail2.next.data) {
                    int temp = tail2.data;
                    tail2.data = tail2.next.data;
                    tail2.next.data = temp;
                    swapped = true;
                }
                tail2 = tail2.next;
            }
        }
    }
    
    public static void display() {
        node tail = Head;
        while (tail != null) {
            System.out.print(tail.data + " ");
            tail = tail.next;
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
        insertatend(10);
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
