class node{
    int data;
    node next;
    node prev;
    node(int data){
        this.data = data;
        next = null;
        prev = null;
    }
}

public class RotateDLL {
    static node head;
    static node tail;

    public static void insert(int x){
        node n = new node(x);
        if(head == null)
            head = n;
        else{
            tail = head;
            while(tail.next != null)
                tail = tail.next;
            tail.next = n;
        }
    }

    public static void rotate(int n){
        if(head == null)
            System.out.println("No elements to rotate");
        else{
            for(int i = 0;i < n;i ++){
                int temp = head.data;
                head = head.next;
                insert(temp);
            }
        }
    }

    public static void printList(){
        if(head == null)
            System.out.println("List is empty");
        else{
            tail = head;
            while(tail != null){
                System.out.print(tail.data + " ");
                tail = tail.next;
            }
            System.out.println("Null");
        }
    }
    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        insert(60);
        printList();

        rotate(2);
        printList();
    }
}
