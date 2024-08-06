import java.util.Stack;

public class RemoveMiddleinStack {
    public static void removeMid(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        int mid = arr.length / 2;
        for (int i = 0; i < mid; i++)
            st.push(arr[i]);
        int k = 0;
        while (!st.isEmpty()){
            ans[k] = st.pop();
            k ++;
        }
        for(int i = ans.length - 1;i >= 0;i --){
            if(ans[i] != 0)
                System.out.print(ans[i] + " ");
        }
        for (int i = mid + 1; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4};
        removeMid(n);
        int[] n2 = {1,2,3,4,5};
        removeMid(n2);
    }
}
