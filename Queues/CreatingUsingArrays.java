public class CreatingUsingArrays {
    static int size = 10;
    static int[] arr = new int[size];
    static int front = 0;
    static int rear = -1;
    static int len = 0;

    public static void enqueue(int n){
        if (len >= size)
            System.out.println("Overflow");
        else{
            rear ++;
            arr[rear] = n;
        }
        len ++;
    }

    public static void dequeue(){
        if(len <= 0)
            System.out.println("Underflow");
        else{
            front ++;
        }
        len --;
    }

    public static int peek(){
        int x = 0;
        if(len <= 0)
            x = -1;
        else
            x = arr[front];
        return x;
    }

    public static boolean isEmpty(){
        if(len <= 0)
            return true;
        return false;
    }

    public static int size(){
        return len;
    }
    public static void printdata(){
        if(rear == -1)
            System.out.println("Queue is empty");
        else{
            for(int i = front;i <= rear;i ++)
                System.out.print(arr[i] + " ");
            System.out.println("Null");
        }
    }
    public static void main(String args[]){
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);
        printdata();

        dequeue();
        printdata();

        System.out.println(peek());

        System.out.println(isEmpty());

        System.out.println(size());
    }
}
