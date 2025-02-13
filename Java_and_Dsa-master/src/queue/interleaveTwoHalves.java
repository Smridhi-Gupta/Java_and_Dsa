package queue;
import java.util.LinkedList;
import java.util.Queue;

public class interleaveTwoHalves {
    public static void interLeave(Queue<Integer> q) {
        Queue<Integer> firsHalf = new LinkedList<>();
        int size = q.size();

        for (int i = 0; i < size/2; i++) {
            firsHalf.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interLeave(q);
    }
}
