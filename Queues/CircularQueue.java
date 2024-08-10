class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        next = null;
    }
}

public class CircularQueue {
    static node head;
    static node tail;
    static int len = 0;
    static int size = 10;

    public static void enqueue(int n){
        node temp = new node(n);
        if (len >= size)
            System.out.println("Overflow");
        else{
            if(head == null){
                head = temp;
                head.next = head;
            }
            else{
                tail = head;
                while(tail.next != head){
                    tail = tail.next;
                }
                tail.next = temp;
                temp.next = head;
            }
            len ++;
        }
    }

    public static void dequeue(){
        if(len <= 0)
            System.out.println("Underflow");
        else{
            if(head == null)
                System.out.println("No elements found");
            else{
                tail = head;
                while(tail.next != head)
                    tail = tail.next;
                head = head.next;
                tail.next = head;
            }
            len --;
        }
    }

    public static boolean isEmpty(){
        if(len > 0)
            return false;
        return true;
    }

    public static int size(){
        return len;
    }

    public static int peek(){
        int x = 0;
        if(len <= 0)
            x = -1;
        else
            x = head.data;
        return x;
    }

    public static void printdata(){
        if(head == null)
            System.out.println("Queue is empty");
        else{
            tail = head;
            do{
                System.out.print(tail.data + " ");
                tail = tail.next;
            } while(tail != head);
            System.out.println("Null");
        }
    }
    public static void main(String args[]){
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
