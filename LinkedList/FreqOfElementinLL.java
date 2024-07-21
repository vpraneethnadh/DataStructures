class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        next = null;
    }
}

public class FreqOfElementinLL {
    static node head;
    static node tail;
    public static void insert(int n){
        node temp = new node(n);
        if (head == null) {
            head = temp;
        } else {
            node tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = temp;
        }
    }
    public static void findfreq(int n){
        int count = 0;;
        node temp = head;
        while(temp != null){
            if(temp.data == n)
                count++;
            temp = temp.next;
        }
        System.out.println("Frequency of the element: " + count);
    }
    public static void printdata(){
        node tail = head;
        while (tail != null) {
            System.out.print(tail.data + " ");
            tail = tail.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(90);
        insert(40);
        insert(40);
        printdata();

        findfreq(40);
    }
}
