class prinode {
    int data;
    int priority;
    prinode next;

    prinode(int data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
    }
}

public class CreatingPriorityQueueUsingLinkedList {
    public static prinode head;
    public static prinode tail;
    public static int len = 0;

    public static void push(int n, int pri) {
        prinode temp = new prinode(n, pri);
        if (head == null || head.priority < pri) {
            temp.next = head;
            head = temp;
        } else {
            tail = head;
            while (tail.next != null && tail.next.priority >= pri) {
                tail = tail.next;
            }
            temp.next = tail.next;
            tail.next = temp;
        }
        len++;
    }

    public static void pop(){
        if (head == null) {
            System.out.println("Priority Queue is empty, No elements found");
        } else {
            head = head.next;
            len--;
        }
    }

    public static int peek(){
        if(head == null)
            return -1;
        return head.data;
    }

    public static boolean isEmpty(){
        return head == null;
    }

    public static void printdata() {
        if (head == null) {
            System.out.println("No data found");
        } else {
            tail = head;
            while (tail != null) {
                System.out.print(tail.data + " ");
                tail = tail.next;
            }
            System.out.println("Null");
        }
    }

    public static void main(String args[]) {
        push(10, 2);
        push(14, 4);
        push(16, 4);
        push(12, 3);
        printdata();

        pop();
        printdata();

        System.out.println(peek());

        System.out.println(isEmpty());
    }
}
