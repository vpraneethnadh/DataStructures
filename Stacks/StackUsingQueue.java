import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();
    static int len = 0;
    static final int size = 10;

    public static void push(int n) {
        if (len >= size)
            System.out.println("Queue is full");
        else {
            q2.add(n);
            while (!q1.isEmpty())
                q2.add(q1.poll());
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
            len++;
        }
    }

    public static void pop() {
        if (q1.isEmpty()) {
            System.out.println("Queue is empty");
        } 
        else {
            len--;
            q1.poll();
        }
    }

    public static void main(String args[]) {
        push(10);
        push(20);
        push(30);
        System.out.println(q1);
        pop();
        pop();
        System.out.println(q1);
    }
}
