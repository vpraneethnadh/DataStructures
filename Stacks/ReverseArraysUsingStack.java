import java.util.Stack;
public class ReverseArraysUsingStack {
    public static void reverseArray(int[] arr){
        int[] arr2 = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i < arr.length;i ++)
            st.push(arr[i]);
        for(int i = 0;i < arr.length;i ++)
            arr2[i] = st.pop();
        for(int i = 0;i < arr2.length;i ++)
            System.out.print(arr2[i] + " ");
    }
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);
    }
}
