import java.util.Stack;

public class BalancedString {
    static void main() {
        String s = "[{()}]";
        System.out.println(isBalanced(s));
    }
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(')
                stack.push(c);
            else if (c=='}'|| c==')' || c==']') {
                 if (stack.isEmpty() ||  !ispair(stack.pop(),c))
                    return false;
            }
        }
        return stack.isEmpty();

    }

public static boolean ispair(Character ch1, Character ch2) {
        if ((ch1=='{' && ch2=='}') || ch1=='(' && ch2==')' || ch1=='[' && ch2==']' )
            return true;
        return false;
}

}
