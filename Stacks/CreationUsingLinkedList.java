class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        next = null;
    }
}

public class CreationUsingLinkedList {
    static node head;
    static node tail;
    static int size = 10;
    static int top = 0;
    public static void insert(int n){
        node temp = new node(n);
        if(head == null)
            head = temp;
        else if(top > size)
            System.out.println("Stack Overflow");
        else{
            tail = head;
            while(tail.next != null)
                tail = tail.next;
            tail.next = temp;
        }
        top ++;
    }
    public static void delete(){
        if(head == null)
            System.out.println("Stack is empty");
        else if(top <= 0)
            System.out.println("Sack Underflow");
        else{
            tail = head;
            while(tail.next.next != null)
                tail = tail.next;
            tail.next = null;
        }
        top --;
    }
    public static void peek(){
        if(head == null)
            System.out.println("Stack is empty");
        else{
            tail = head;
            while(tail.next != null)
                tail = tail.next;
            System.out.println(tail.data);
        }
    }
    public static boolean isEmpty(){
        if(head == null)
            return true;
        return false;
    }
    public static void printdata(){
        if(head == null)
            System.out.println("Stack  is empty");
        else{
            tail = head;
            while(tail != null){
                System.out.print(tail.data + " ");
                tail = tail.next;
            }
            System.out.println("Null");
        }
    }
    public static void main(String args[]){
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        printdata();

        delete();
        delete();
        printdata();

        peek();

        System.out.println(isEmpty());
    }
}
