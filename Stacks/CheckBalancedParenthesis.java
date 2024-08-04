import java.util.Stack;

public class CheckBalancedParenthesis {
    public static void isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (st.isEmpty()) {
                    flag = false;
                    break;
                }
                char last = st.pop();
                if ((ch == ')' && last != '(') || (ch == ']' && last != '[') || (ch == '}' && last != '{')) {
                    flag = false;
                    break;
                }
            }
        }
        if (!st.isEmpty()) {
            flag = false;
        }
        if (flag) {
            System.out.println("Balanced");
        } else {
            System.out.println("Unbalanced");
        }
    }

    public static void main(String[] args) {
        String str1 = "({[]})";
        String str2 = "({[])";
        
        isBalanced(str1);
        isBalanced(str2);
    }
}
