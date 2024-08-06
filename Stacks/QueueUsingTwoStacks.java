import java.util.Stack;

public class QueueUsingTwoStacks {
    static Stack<Integer> st1 = new Stack<Integer>();
    static Stack<Integer> st2 = new Stack<Integer>();
    static int size = 10;
    static int top = 0;

    public static void enqueue(int n) {
        if (top >= size) {
            System.out.println("Queue is Full");
        } else {
            st1.push(n);
            top++;
        }
    }

    public static void dequeue() {
        if (top == 0) {
            System.out.println("Queue is Empty");
        } else {
            if (st2.isEmpty()) {
                while (!st1.isEmpty()) {
                    st2.push(st1.pop());
                }
            }
            st2.pop();
            top--;
        }
    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        System.out.println("Queue: " + st1);

        dequeue();
        System.out.println("Queue: " + st2); 

        dequeue();
        System.out.println("Queue: " + st2);

        dequeue();
    }
}
