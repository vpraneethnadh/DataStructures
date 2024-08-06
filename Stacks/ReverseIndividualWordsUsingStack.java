import java.util.Stack;
public class ReverseIndividualWordsUsingStack {
    public static String reverseWord(String str){
        Stack<Character> stack = new Stack<>();
        String result = "";
        for(int i = 0;i < str.length();i ++){
            char ch = str.charAt(i);
            stack.push(ch);
        }
        for(int i = 0;i < str.length();i ++){
            char ch = stack.pop();
            result += ch;
        }
        result += " ";
        return result;
    }
    public static void reverseEveryWord(String str){
        String[] strarr = str.split(" ");
        String res = "";
        for(int i = 0;i < strarr.length;i ++)
            res += reverseWord(strarr[i]);
        System.out.println(res);
    }
    public static void main(String args[]){
        String str = "Hello World";
        reverseEveryWord(str);

        String str2 = "This is a Stack Problem";
        reverseEveryWord(str2);
    }
}
