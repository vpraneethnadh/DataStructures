import java.util.Stack;

public class RemoveCharsUsingStack {
    public static void removeCharacters(String str1, String str2) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (str2.indexOf(ch) == -1) {
                st.push(ch);
            }
        }
        
        String ans = "";
        while (!st.isEmpty()) {
            ans += st.pop();
        }
        String res = "";
        for(int i = ans.length() - 1;i >= 0;i --){
            char ch = ans.charAt(i);
            res += ch;
        }
        System.out.println(res);
    }
    
    public static void main(String[] args) {
        String str1 = "computer";
        String str2 = "car";

        removeCharacters(str1, str2);
    }
}
