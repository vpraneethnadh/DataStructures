class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        next = null;
    }
}

public class CircularLLintoTwoHalves {
    static node head;
    static node tail;
    static int len = 0;

    public static void insert(int n){
        node t = head;
        node temp = new node(n);

        if (head == null) {
            head = temp;
            head.next = head;
        } else {
            while (t.next != head)
                t = t.next;
            t.next = temp;
            temp.next = head;
        }
        len ++;
    }

    public static void twoEqualHalves(){
        node t = head;
        int n = len / 2;
        for(int i = 0;i < n;i ++){
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.print("  ||  ");
        for(int i = n;i < len;i ++){
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }

    public static void printdata(){
        if(head == null)
            System.out.println("No links found!");
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
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        insert(60);
        insert(70);
        printdata();

        twoEqualHalves();
    }
}
