package Day20;

import java.util.ArrayDeque;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("(())["));
    }

    public static boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for(char ch : s.toCharArray()) {

            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if(stack.isEmpty()) return false;

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
