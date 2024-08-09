import java.util.Stack;

public class StockSpan {

    public static void calculateStockSpan(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];

        st.push(0);
        res[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i])
            st.pop();

            if (st.isEmpty())
                res[i] = i + 1;
            else
                res[i] = i - st.peek();
            st.push(i);
        }

        for (int i = 0; i < res.length; i++)
            System.out.print(res[i] + " ");
    }

    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        calculateStockSpan(arr);
    }
}