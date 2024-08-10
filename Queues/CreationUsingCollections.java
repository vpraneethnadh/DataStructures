import java.util.LinkedList;
import java.util.Queue;
public class CreationUsingCollections {
    public static void main(String args[]){
        Queue<Integer> qu = new LinkedList<Integer>();
        qu.add(10);
        qu.add(20);
        qu.add(30);
        System.out.println(qu);

        qu.remove();
        System.out.println(qu);

        System.out.println(qu.peek());

        System.out.println(qu.size());

        System.out.println(qu.isEmpty());
    }
}
