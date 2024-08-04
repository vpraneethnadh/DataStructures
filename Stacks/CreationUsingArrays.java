public class CreationUsingArrays{
    static int size = 10;
    static int[] arr = new int[size];
    static int top = -1;
    public static void insert(int n){
        if(top > size)
            System.out.println("Stack is full,Overflow");
        else{
            top ++;
            arr[top] = n;
        }
    }
    public static void delete(){
        if(top < 0)
            System.out.println("Stack is empty,Underflow");
        else{
            top --;
        }
    }
    public static void peek(){
        if(top == -1)
            System.out.println("Stack is empty");
        else
            System.out.println(arr[top]);
    }
    public static boolean isEmpty(){
        if(top == -1)
            return true;
        return false;
    }
    public static void printdata(){
        if(top == -1)
            System.out.println("Stack is empty");
        else{
            for(int i = 0;i <= top;i ++)
                System.out.print(arr[i] + " ");
        }
        System.out.println("Null");
    }
    public static void main(String args[]){
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        printdata();

        delete();
        delete();
        printdata();

        peek();

        System.out.println(isEmpty());
    }
}