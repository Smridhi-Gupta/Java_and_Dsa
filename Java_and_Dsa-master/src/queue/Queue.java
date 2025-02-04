package queue;

public class Queue {
    static class Queuee {
        static int arr[];
        static int size;
        static int rear;

        Queuee(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // add
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }
    }

    public static void main(String[] args) {

    }
}
