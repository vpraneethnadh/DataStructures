import java.util.*;
public class SortStackUsingTempStack {
    public static void sort(int[] arr){
        Stack<Integer> st = new Stack<>();
        Stack<Integer> tempst = new Stack<>();
        for(int i = 0;i < arr.length;i ++)
            st.push(arr[i]);
        while(!st.isEmpty()){
            int temp = st.pop();
            while(!tempst.isEmpty() && tempst.peek() > temp)
                st.push(tempst.pop());
            tempst.push(temp);
        }
        System.out.println(tempst);
    }
    public static void main(String args[]){
        int[] arr = {3, 2, 1, 5, 6, 4};
        sort(arr);
    }
}
