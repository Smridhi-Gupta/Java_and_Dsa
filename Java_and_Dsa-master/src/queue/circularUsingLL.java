package queue;

public class circularUsingLL {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class Queuee {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // add
        public static void add(int data) {

        }

        // remove
        public static int remove() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int result = arr[front];

            // last element delete
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queuee q = new Queuee(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
