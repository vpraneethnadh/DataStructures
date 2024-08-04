import java.util.*;

public class NearestSmallestElement {
    public static void nearstelement(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() >= arr[i])
                st.pop();
            if (st.isEmpty())
                ans[i] = Integer.MIN_VALUE;
            else
                ans[i] = st.peek();
            st.push(arr[i]);
        }

        for (int i = 0; i < ans.length; i++) {
            if (ans[i] == Integer.MIN_VALUE)
                System.out.print("_" + " ");
            else
                System.out.print(ans[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int[] arr = {1, 3, 0, 2, 5};
        nearstelement(arr);
    }
}
