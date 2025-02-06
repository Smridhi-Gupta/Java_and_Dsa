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
    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }
    }
    public static void main(String[] args) {

    }
}
