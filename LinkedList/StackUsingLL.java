class stnode{
    int data;
    stnode next;
    stnode(int data){
        this.data = data;
        next = null;
    }
}
public class StackUsingLL {
    static stnode head;
    static int top = -1;
    static int len;
    static int size = 10;
    public static void insert(int n){
        if(size < len)
            System.out.println("Overflow");
        else{
            stnode st = new stnode(n);
            if(head == null)
                head = st;
            else{
                st.next = head;
                head = st;
            }
        }
        top ++;
        len ++;
    }
    public static void delete(){
        if(top == -1)
            System.out.println("Underflow");
        else{
            head = head.next;
            top --;
        }
    }
    public static void display(){
        stnode tail = head;
        if(top == -1)
            System.out.println("No Elements Found!");
        else{
            while(tail != null){
                System.out.print(tail.data + " ");
                tail = tail.next;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        insert(10);
        insert(20);
        insert(100);
        display();

        delete();
        display();
    }
}
