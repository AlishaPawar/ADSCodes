import java.util.Stack;

class InfixToPostfix 
{
    public static int precedence(char ch) 
	{
        if (ch == '+' || ch == '-')
            return 1;
        else if (ch == '*' || ch == '/')
            return 2;
        return 0;
    }

    public static String convertToPostfix(String exp) 
	{
        Stack<Character> operators = new Stack<Character>();
        Stack<String> postFix = new Stack<String>();

        for (int i = 0; i < exp.length(); i++) 
		{
            char ch = exp.charAt(i);

            if (Character.isLetterOrDigit(ch)) 
			{
                postFix.push(Character.toString(ch));
           } 
			else if (ch == '(') 
			{
                operators.push(ch);
           } 
			else if (ch == ')') 
			{
                while (!operators.isEmpty() && operators.peek() != '(') 
				{
                    char op = operators.pop();
                    String second = postFix.pop();
                    String first = postFix.pop();
                    String new_postFix = first + second + op;
                    postFix.push(new_postFix);
                }
                operators.pop(); // Pop the opening parenthesis
           } 
			else 
			{
                while (!operators.isEmpty() && precedence(ch) <= precedence(operators.peek())) 
				{
                    char op = operators.pop();
                    String second = postFix.pop();
                    String first = postFix.pop();
                    String new_postFix = first + second + op;
                    postFix.push(new_postFix);
                }
                operators.push(ch);
            }
        }

        while (!operators.isEmpty()) 
		{
            char op = operators.pop();
            String second = postFix.pop();
            String first = postFix.pop();
            String new_postFix = first + second + op;
            postFix.push(new_postFix);
        }

        return postFix.pop();
    }

    public static void main(String args[]) 
	{
        String infixExpression = "((a+(b*c))-d)";
        System.out.println("The Infix Expression is: " + infixExpression);

        String result = convertToPostfix(infixExpression);
        System.out.println("The Postfix of the given Infix Expression is: " + result);

        System.out.println();
    }
}
