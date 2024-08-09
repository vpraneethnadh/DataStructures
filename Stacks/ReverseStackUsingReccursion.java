import java.util.*;
public class ReverseStackUsingReccursion {
    static Stack<Integer> st = new Stack<>();
    public static void reverse(){
        if(st.size() > 0){
            int x = st.peek();
            st.pop();
            reverse();
            insertAtBottom(x);
        }
    }
    public static void insertAtBottom(int temp){
        if(st.isEmpty())
            st.push(temp);
        else{
            int a = st.peek();
            st.pop();
            insertAtBottom(temp);
            st.push(a);
        }
    }
    public static void printdata(){
        System.out.println(st);
    }
        
    public static void main(String args[]){
        int[] arr = {9,8,7,6,5,4,3,2,1};
        for(int i = 0;i < arr.length;i ++)
            st.push(arr[i]);
        reverse();
        printdata();
    }
}
