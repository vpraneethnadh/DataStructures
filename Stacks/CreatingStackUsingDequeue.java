class dqnode{
    int data;
    dqnode next;
    dqnode prev;
    dqnode(int data){
        this.data = data;
        next = null;
        prev = null;
    }
}
public class CreatingStackUsingDequeue {
    public static dqnode head;
    public static dqnode tail;
    public static int len = 0;
    public static int size = 10;

    public static void push(int n){
        dqnode temp = new dqnode(n);
        if(len > size)
            System.out.println("Overflow");
        else{
            if(head == null)
                head = temp;
            else{
                tail = head;
                while(tail.next != null)
                    tail = tail.next;
                tail.next = temp;
            }
        }
        len ++;
    }

    public static void pop(){
        if(len <= 0)
            System.out.println("Underflow");
        else{
            if(head == null)
                System.out.println("No elements to remove");
            else{
                tail = head;
                if(len > 1){
                    while(tail.next.next != null)
                        tail = tail.next;
                    tail.next = null;
                }
                else if(len == 1)
                    head = head.next;
            }
        }
        len --;
    }

    public static int peek(){
        int x = 0;
        if(head == null)
            x = -1;
        else
            x = head.data;
        return x;
    }

    public static boolean isEmpty(){
        if(head == null)
            return true;
        return false;
    }

    public static void printdata(){
        if(head == null)
            System.out.println("No data found");
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
        push(10);
        push(20);
        push(30);
        push(40);
        printdata();

        pop();
        pop();
        printdata();

        System.out.println(peek());

        System.out.println(isEmpty());

        pop();
        pop();
        printdata();

        System.out.println(isEmpty());
    }
}