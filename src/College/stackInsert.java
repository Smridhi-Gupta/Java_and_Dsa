package College;

public class stackInsert {
        private static final int MAX_SIZE = 10;
        private int[] stackArray;
        private int top;

        public stackInsert() {
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

        public static void main(String[] args) {
            stackInsert stack = new stackInsert();

            stack.push(10);
            stack.push(20);
            stack.push(30);
        }
    }