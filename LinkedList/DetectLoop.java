class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        next = null;
    }
}

public class DetectLoop {
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

    public static void detectLoop() {
        node t1 = head;
        node t2 = head;
        while (t1 != null && t2 != null && t2.next != null) {
            t1 = t1.next;
            t2 = t2.next.next;
    
            if (t1 == t2) {
                System.out.println("Loop Detected");
                return;
            }
        }
        System.out.println("No Loop Detected");
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

        detectLoop();
    }
}
