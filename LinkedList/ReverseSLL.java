class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        next = null;
    }
}

public class ReverseSLL {
    static node head;
    static node tail;
    static int len = 0;

    public static void insert(int n){
        node temp = new node(n);
        if(head == null){
            head = temp;
        }
        else{
            tail = head;
            while(tail.next != null){
                tail = tail.next;
            }
            tail.next = temp;
        }
        len ++;
    }

    public static void reverse(){
        node t1 = head;
        node t2 = head;
        if(t2 == null)
            return;
        t2 = t2.next;
        while(t2 != null){
            node temp = t2;
            t2 = t2.next;
            temp.next = t1;
            t1 = temp;
        }
        head.next = null;
        head = t1;
    }

    public static void printdata(){
        node temp = head;
        if(head == null)
            System.out.println("No links available!");
        else{
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
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
        insert(60);
        printdata();

        reverse();
        printdata();
    }
}
