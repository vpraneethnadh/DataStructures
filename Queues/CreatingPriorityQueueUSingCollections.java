import java.util.*;
public class CreatingPriorityQueueUSingCollections {
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(5);
        pq.add(30);
        System.out.println(pq);

        pq.remove();
        System.out.println(pq);

        System.out.println(pq.peek());

        System.out.println(pq.isEmpty());

        pq.remove(20);
        System.out.println(pq);
    }
}
