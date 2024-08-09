import java.util.Stack;

public class BalancedParanthesis {
    public static boolean isBalance(String str) {
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch == '(' || ch == '[' || ch == '{')
                st.push(ch);
            else if (ch == ')' || ch == ']' || ch == '}') {
                if (st.isEmpty()) {
                    return false;
                }
                char last = st.pop(); 
                if ((ch == ')' && last != '(') ||
                    (ch == ']' && last != '[') ||
                    (ch == '}' && last != '{')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String args[]) {
        String s = "((()))";
        System.out.println(isBalance(s)); 

        s = "([{}])";
        System.out.println(isBalance(s)); 

        s = "((())";
        System.out.println(isBalance(s));

        s = "([)]";
        System.out.println(isBalance(s)); 
    }
}
