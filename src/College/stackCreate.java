package College;
import java.util.Stack;

public class stackCreate {

        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();

            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);

            System.out.println("Stack elements:");
            traverseStack(stack);
        }
        public static void traverseStack(Stack<Integer> stack) {
            if (stack.isEmpty()) {
                System.out.println("Stack is empty.");
                return;
            }

            for (Integer element : stack) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

}
