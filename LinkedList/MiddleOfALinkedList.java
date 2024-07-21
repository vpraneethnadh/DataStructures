class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        next = null;
    }
}

public class MiddleOfALinkedList {
    static node head;
    static node tail;
    public static void insert(int n){
        node temp = new node(n);
        if (head == null) {
            head = temp;
        } else {
            node tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = temp;
        }
    }
    public static void findmid(){
        node temp = head;
        int len = 0;
        tail = head;
        while(tail != null){
            tail = tail.next;
            len ++;
        }
        int mid = len/2;
        while(mid > 0){
            temp = temp.next;
            mid --;
        }
        System.out.println("Middle element: " + temp.data);
    }
    public static void printdata(){
        node tail = head;
        while (tail != null) {
            System.out.print(tail.data + " ");
            tail = tail.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        insert(60);
        insert(70);
        insert(80);
        insert(90);
        printdata();

        findmid();
    }
}
