import java.util.Scanner;

class Stack1 {
    static final int MAX = 5;
    int top;
    int stack[] = new int[MAX];

    Stack1() {
        top = -1;
    }

    boolean isEmpty() {
        return (top < 0);
    }

    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Overflow!");
            return false;
        } else {
            stack[++top] = x;
            System.out.println(x + " Push ...");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Underflow!");
            return 0;
        } else {
            int x = stack[top--];
            return x;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Underflow!");
            return 0;
        } else {
            int x = stack[top];
            return x;
        }
    }
}

public class StackApp1 {
    public static void main(String args[]) {
        Stack1 s1 = new Stack1();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu for stack program");
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. PEEK");
            System.out.println("4. ISEMPTY");
            System.out.println("5. EXIT");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = sc.nextInt();
                    s1.push(element);
                    break;
                case 2:
                    System.out.println("Deleted element = " + s1.pop());
                    break;
                case 3:
                    System.out.println("Top of stack element = " + s1.peek());
                    break;
                case 4:
                    System.out.println("Is the stack empty? " + s1.isEmpty());
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

        } while (choice != 5);
    }
}
