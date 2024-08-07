import java.util.LinkedList;
import java.util.Queue;

public class StackUsingSingleQueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static int top = 0;
    static int size = 10;
    
    public static void push(int n) {
        if (top >= size) {
            System.out.println("Stack is full, Overflow");
        } else {
            q1.add(n);
            top++;
        }
    }
    
    public static void pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty, Underflow");

        } else {
            for (int i = 0; i < q1.size() - 1; i++) {
                q1.add(q1.remove());
            }
            top--;
            q1.remove();
        }
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        System.out.println(q1);
        pop();
        pop();
        System.out.println(q1);
    }
}
