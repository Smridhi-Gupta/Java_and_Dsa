package stack;

import java.util.Stack;

public class validParenthesis {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //opening
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                // closing
                if (s.isEmpty()) {
                    return false;
                }
                if (ch == null) {
                    
                }
            } 
        }
    }

    public static void main(String[] args) {
        String str = "({}) []"; // true
    }
}
