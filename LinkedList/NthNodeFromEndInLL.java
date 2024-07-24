class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        next = null;
    }
}

public class NthNodeFromEndInLL {
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

    public static void getFromLast(int n){
        if(head == null)
            System.out.println("No elements found!");
        else if(n > len)
            System.out.println("Invalid Input!,Check the given input value.");
        else{
            int pos = len - n;
            tail = head;
            while(pos > 1){
                tail = tail.next;
                pos --;
            }
            System.out.println("The value of the data entered: " + tail.next.data);
        }
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

        getFromLast(3);
    }
}
