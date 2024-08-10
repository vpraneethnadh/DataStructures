import java.util.*;
public class ReverseKElements {
    public static void reversekelements(int[] arr,int k){
        Queue<Integer> qu = new LinkedList<Integer>();
        Queue<Integer> qu2 = new LinkedList<Integer>();
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0;i < arr.length;i ++)
            qu.add(arr[i]);
        for(int i = 0;i < k;i ++)
            st.add(qu.poll());
        while(!st.isEmpty())
            qu2.add(st.pop());
        for(int i = k;i < arr.length;i ++)
            qu2.add(qu.poll());

        System.out.println(qu2);
    }
    public static void main(String args[]){
        int[] arr = {3,2,1,4,5,6};
        int k = 3;
        reversekelements(arr,k);
    }
}
