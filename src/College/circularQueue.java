package College;
class Circular {
    private int[] queue;
    private int front; // Index of the front element
    private int rear;  // Index of the rear element
    private int size;  // Current size of the queue
    private int capacity; // Maximum capacity of the queue

    public Circular(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1; // Initialize rear to -1 because the first enqueue will make it 0
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }

        // Increment rear in a circular fashion
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
        System.out.println("Enqueued: " + item);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Return a default value or throw an exception to indicate an error
        }
        int item = queue[front];
        // Increment front in a circular fashion
        front = (front + 1) % capacity;
        size--;
        System.out.println("Dequeued: " + item);
        return item;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1; // Return a default value or throw an exception to indicate an error
        }

        return queue[front];
    }

    public int rear() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1; // Return a default value or throw an exception to indicate an error
        }

        return queue[rear];
    }

    public int size() {
        return size;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Circular Queue: ");
        int i = front;
        do {
            System.out.print(queue[i] + " ");
            i = (i + 1) % capacity;
        } while (i != (rear + 1) % capacity);

        System.out.println();
    }

    public static void main(String[] args) {
        Circular cq = new Circular(5);

        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        System.out.println("Front: " + cq.front());
        System.out.println("Rear: " + cq.rear());
        cq.display();
        cq.dequeue();
        System.out.println("Front: " + cq.front());
        cq.enqueue(4);
        cq.enqueue(5);
        System.out.println("Front: " + cq.front());
        System.out.println("Rear: " + cq.rear());
        System.out.println("Size: " + cq.size());
        System.out.println("Is Empty: " + cq.isEmpty());
        System.out.println("Is Full: " + cq.isFull());
        cq.display();
    }
}