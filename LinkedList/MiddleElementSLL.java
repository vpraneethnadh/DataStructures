class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        next = null;
    }
}

public class MiddleElementSLL {
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

     public static void findMiddle(){
        int m = len / 2;
        tail = head;
        while(m > 1){
            tail = tail.next;
            m --;
        }
        if(len % 2 == 0)
            System.out.println("There are two elements in middle: " + tail.data + "," + tail.next.data);
        else
            System.out.println("Middle Element is: " + tail.next.data);
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
        insert(70);
        insert(80);
        insert(90);
        printdata();

        findMiddle();
    }
}
