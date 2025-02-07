package queue;
import java.util.*;

public class QueueUsingTwoStacks {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        public static boolean isEmpty() {
            return s1.isEmpty();
        }
    }
    public static void main(String[] args) {

    }
}
