import java.util.*;

public class NextGreaterElement {
    public static void findElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        st.push(arr[0]);
        int element, next;
        
        for (int i = 1; i < n; i++) {
            next = arr[i];
            if (!st.isEmpty()) {
                element = st.pop();
                while (element < next) {
                    System.out.println(element + " --> " + next);
                    if (st.isEmpty())
                        break;
                    element = st.pop();
                }
                if (element > next)
                    st.push(element);
            }
            st.push(next);
        }
        
        while (!st.isEmpty()) {
            element = st.pop();
            next = -1;
            System.out.println(element + " --> " + next);
        }
    }

    public static void main(String args[]) {
        int[] arr = {13, 7, 6, 12};
        findElement(arr);
    }
}
