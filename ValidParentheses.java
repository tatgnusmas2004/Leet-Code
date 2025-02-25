import java.util.Stack;

public class ValidParentheses {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    char[] ss = s.toCharArray();
    for (char c : ss) {
      if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
      } else {
        if (stack.empty()) {
          return false;
        }
        char top = stack.pop();
        if ((c == ')' && top != '(') ||
            (c == ']' && top != '[') ||
            (c == '}' && top != '{')) {
          return false;
        }
      }
    }
    return stack.empty();
  }

  public static void main(String[] args) {
    ValidParentheses test = new ValidParentheses();
    String s = "(){}}{";
    System.out.println(test.isValid(s));
  }
}
