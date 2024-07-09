class dnode {
    int data;
    dnode next;
    dnode prev;

    dnode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoubleLinkedListTraversal {
    static dnode head;
    static dnode tail;

    public static void insert(int n) {
        dnode temp = new dnode(n);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    public static void sort() {
        if (head == null) 
            return;
        
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            dnode tail2 = head;
            while (tail2.next != null) {
                if (tail2.data > tail2.next.data) {
                    int temp = tail2.data;
                    tail2.data = tail2.next.data;
                    tail2.next.data = temp;
                    swapped = true;
                }
                tail2 = tail2.next;
            }
        }
    }

    public static void display() {
        dnode t1 = head;
        dnode t2 = tail;

        System.out.print("Forward: ");
        while (t1 != null) {
            System.out.print(t1.data + " ");
            t1 = t1.next;
        }
        System.out.println();

        System.out.print("Backward: ");
        while (t2 != null) {
            System.out.print(t2.data + " ");
            t2 = t2.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        insert(10);
        insert(40);
        insert(30);
        insert(20);
        insert(50);

        System.out.println("Before Sorting:");
        display();

        sort();

        System.out.println("After Sorting:");
        display();
    }
}
