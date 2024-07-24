class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        next = null;
    }
}

public class SearchInSLL {
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

    public static void search(int n){
        tail = head;
        boolean flag = true;
        while(tail.next != null){
            tail = tail.next;
            if(tail.data == n)
                flag = false;
        }
        if(flag == false)
            System.out.println("Element found!");
        else
            System.out.println("Element not found!");
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

        search(40);
        search(100);
    }
}
