package College;

public class StackDelete {
        private static final int MAX_SIZE = 10;
        private int[] stackArray;
        private int top;

        public StackDelete() {
            stackArray = new int[MAX_SIZE];
            top = -1;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == MAX_SIZE - 1;
        }

        public void push(int value) {
            if (isFull()) {
                System.out.println("Stack is full. Cannot push " + value);
                return;
            }
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " onto the stack.");
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot pop.");
                return -1;
            }
            int poppedValue = stackArray[top--];
            System.out.println("Popped " + poppedValue + " from the stack.");
            return poppedValue;
        }

        public static void main(String[] args) {
            StackDelete stack = new StackDelete();

            stack.push(10);
            stack.push(20);
            stack.push(30);

            int poppedValue = stack.pop();
            System.out.println("Popped element: " + poppedValue);
        }
    }
