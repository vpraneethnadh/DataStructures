class dnode{
    int data;
    dnode next;
    dnode prev;
    dnode(int data){
        this.data = data;
        next = null;
        prev = null;
    }
}

public class AllPairsInDLL {
    static dnode head;
    static dnode tail;

    public static void insert(int n) {
        dnode node = new dnode(n);
        if(head == null)
            head = node;
        else {
            tail = head;
            while(tail.next!= null) {
                tail = tail.next;
            }
            node.prev = tail;
            tail.next = node;
        }
    }

    public static void findpairs(int n) {
        dnode t1, t2;
        t1 = head;
        while(t1!= null) {
            t2 = t1.next;
            while(t2!= null) {
                if(t1.data + t2.data == n)
                    System.out.println("(" + t1.data + "," + t2.data + ")");
                t2 = t2.next;
            }
            t1 = t1.next;
        }
    }

    public static void display() {
        if(head == null)
            System.out.println("No links found");
        else {
            dnode temp = head;
            while(temp!= null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        System.out.println();
    }

    public static void reverse() {
        if(head == null)
            System.out.println("No links found");
        else {
            dnode temp = head;
            while(temp.next!= null) {
                temp = temp.next;
            }
            while(temp!= null) {
                System.out.print(temp.data + " ");
                temp = temp.prev;
            }
        }
        System.out.println();
    }

    public static void removedupli() {
        dnode t1, t2;
        t1 = head;
        while(t1!= null) {
            t2 = t1;
            while(t2.next!= null) {
                if(t1.data == t2.next.data) {
                    dnode temp = t2.next;
                    t2.next = t2.next.next;
                    if(t2.next!= null)
                        t2.next.prev = t2;
                    temp = null;
                } else {
                    t2 = t2.next;
                }
            }
            t1 = t1.next;
        }
    }

    public static void main(String args[]) {
        insert(10);
        insert(20);
        insert(30);
        insert(30);
        insert(40);
        insert(50);
        display();

        findpairs(70);

        reverse();

        removedupli();
        display();
    }
}