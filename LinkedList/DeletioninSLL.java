class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        next = null;
    }
}

public class DeletioninSLL {
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

    public static void deleteatbeg(){
        if(head == null)
            System.out.println("LinkedList is Empty!");
        else
            head = head.next;
    }

    public static void deleteatend(){
        if(head == null)
            System.out.println("LinkedList is Empty!");
        else{
            tail = head;
            while(tail.next.next != null)
                tail = tail.next;
            tail.next = null;
        }
    }

    public static void deleteatpos(int pos){
        if(head == null)
            System.out.println("LinkedList is Empty!");
        else{
            tail = head;
            while(pos > 2){
                tail = tail.next;
                pos --;
            }
            tail.next = tail.next.next;
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
        insert(70);
        insert(80);
        insert(90);
        printdata();

        deleteatbeg();
        printdata();

        deleteatend();
        printdata();

        deleteatpos(4);
        printdata();
    }
}
