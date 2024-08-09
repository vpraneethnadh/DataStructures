import java.util.*;

public class DeleteConsicutiveSameWordsStack {
    public static void deleteWords(String str) {
        Stack<String> st = new Stack<>();
        String[] arr = str.split(" ");
        
        for (int i = 0; i < arr.length; i++) {
            if (!st.isEmpty() && st.peek().equals(arr[i]))
                st.pop();
            else 
                st.push(arr[i]);
        }
        System.out.println(st.size());
    }

    public static void main(String[] args) {
        String str = "ab aa aa bcd ab";
        deleteWords(str);
    }
}
