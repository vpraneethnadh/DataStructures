import java.util.Stack;
public class StringReversalUsingStack {
    public static String reverseString(String str){
        Stack<Character> st = new Stack<>();
        for(int i = 0;i < str.length();i ++){
            char ch = str.charAt(i);
            st.push(ch);
        }
        String str2 = "";
        for(int i = 0;i < str.length();i ++){
            char ch = st.pop();
            str2 += ch;
        }
        return str2;
    }
    public static void main(String args[]){
        String str = "helloworld";
        System.out.println(reverseString(str));
    }
}
