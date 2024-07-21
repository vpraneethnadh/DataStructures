class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        next = null;
    }
}

public class SwapFirstAndLastNode {
    static node head;
    static node tail;

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
    }

    public static void swapFirstandLast(){
        node t1,t2;
        t1 = head;
        t2 = head;
        while(t2.next != null){
            t2 = t2.next;
        }
        int temp;
        temp = t1.data;
        t1.data = t2.data;
        t2.data = temp;
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
        printdata();

        swapFirstandLast();
        printdata();
    }
}
