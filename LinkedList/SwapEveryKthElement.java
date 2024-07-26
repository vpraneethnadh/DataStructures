class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        next = null;
    }
}

public class SwapEveryKthElement{
    static node head;
    static node tail;

    public static void insert(int n){
        node temp = new node(n);
        if(head == null)
            head = temp;
        else{
            tail = head;
            while(tail.next != null)
                tail = tail.next;
            tail.next = temp;
        }
    }

    public static void swap(int k) {
        node tail = head;
        int count = 0;
        while (tail != null && tail.next != null) {
            if (count % k == 0) {
                int temp = tail.data;
                tail.data = tail.next.data;
                tail.next.data = temp;
            }
            count++;
            tail = tail.next;
        }
    }

    public static void printdata(){
        if(head == null)
            System.out.println("No links Found!");
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
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);
        printdata();

        swap(3);
        printdata();
    }
}