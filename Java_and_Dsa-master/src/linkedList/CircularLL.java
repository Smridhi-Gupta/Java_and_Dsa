package linkedList;

public class CircularLL {
    static class Node {
        int data;
        Node next;
    }
    static Node addToEmpty(Node last, int data) {
        if (last != null) {
            return last;
            Node newNode = new Node();
            newNode.data = data;
            last = newNode;
            newNode.next = last;
            return last;
        }
    }
    static Node addFront(Node last, int data) {
        if (last == null) {
            return addToEmpty(last, data);
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = last.next;
            last.next = newNode;
            return last;
        }
    }
    static Node addEnd(Node last, int data) {
        if (last == null) {
            return addToEmpty(last, data);
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
            return last;
        }
    }
    static Node addAfter(Node last, int data, int item) {
        if (last == null) {
            return null;
        }
    }
}
