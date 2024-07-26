class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        next = null;
    }
}
public class DeleteNNodesAfterM{
    static node head;
    static node tail;
    static int len = 0;

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
        len ++;
    }

    public static void deletenafterm(int n,int m){
        if(head == null)
            System.out.println("No links found!");
        else{
            tail = head;
            while(m > 0){
                tail = tail.next;
                while(n > 0){
                    tail.next = tail.next.next;
                    n --;
                }
                m --;
            }
        }
    }

    public static void printdata(){
        if(head == null)
            System.out.println("No Data Found!");
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
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        insert(60);
        insert(70);
        insert(80);
        insert(90);
        insert(100);
        printdata();

        deletenafterm(2,4);
        printdata();
    }
}