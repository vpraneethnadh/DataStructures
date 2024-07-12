class snode{
    int data;
    snode next;
    snode(int data){
        this.data = data;
        next = null;
    }
}

public class AllPairsInSLL {
    static snode head, tail;

    public static void insert(int n) {
        snode node = new snode(n);
        if(head == null)
            head = node;
        else {
            tail = head;
            while(tail.next != null) {
                tail = tail.next;
            }
            tail.next = node;
        }
    }

    public static void findpairs(int n) {
        snode t1, t2;
        t1 = head;
        while(t1 != null) {
            t2 = t1.next;
            while(t2 != null) {
                if(t1.data + t2.data == n)
                    System.out.println("(" + t1.data + "," + t2.data + ")");
                t2 = t2.next;
            }
            t1 = t1.next;
        }
    }

    public static void removedupli() {
        snode t1, t2;
        t1 = head;
        while(t1 != null) {
            t2 = t1;
            while(t2.next != null) {
                if(t1.data == t2.next.data) {
                    t2.next = t2.next.next;
                } else {
                    t2 = t2.next;
                }
            }
            t1 = t1.next;
        }
    }

    public static void display() {
        snode tail = head;
        while(tail != null) {
            System.out.print(tail.data + " ");
            tail = tail.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        insert(40);
        insert(50);
        insert(60);
        insert(70);
        display();
        
        findpairs(70);
        
        removedupli();
        display();
    }
}