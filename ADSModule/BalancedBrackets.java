import java.util.Stack;

public class BalancedBrackets {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char openBracket = stack.pop();

                if ((c == ')' && openBracket != '(') ||(c == ']' && openBracket != '[') ||(c == '}' && openBracket != '{')) {
                    return false; 
                }
            }
        }

        return stack.isEmpty(); 
    }

    public static void main(String[] args) {

        String expression = "{[()]()}";

        if (isBalanced(expression)) 
		{
            System.out.println("The expression is balanced.");
        } 
		else 
		{
            System.out.println("The expression is not balanced.");
        }
    }
}
