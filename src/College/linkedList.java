package College;
import java.util.Scanner;
class AllNode {
    int data;
    AllNode next;
    AllNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedListOne {
    AllNode head;
    LinkedListOne() {
        head = null;
    }
    // Insertion at the beginning
    void insertAtStart(int data) {
        AllNode newAllNode = new AllNode(data);
        newAllNode.next = head;
        head = newAllNode;
    }
    // Insertion at the end
    void insertAtEnd(int data) {
        AllNode newAllNode = new AllNode(data);
        if (head == null) {
            head = newAllNode;
            return;
        }
        AllNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newAllNode;
    }
    // Insertion at the middle
    void insertAtMiddle(int data, int position) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }
        AllNode newAllNode = new AllNode(data);
        if (position == 1) {
            newAllNode.next = head;
            head = newAllNode;
            return;
        }
        AllNode current = head;
        int count = 1;
        while (count < position - 1 && current != null) {
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Position exceeds the length of the list");
            return;
        }
        newAllNode.next = current.next;
        current.next = newAllNode;
    }
    // Deletion from the beginning
    void deleteFromStart() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        head = head.next;
    }
    // Deletion from the end
    void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        AllNode current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }
    // Deletion from the middle
    void deleteFromMiddle(int position) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        AllNode current = head;
        int count = 1;
        while (count < position - 1 && current != null) {
            current = current.next;
            count++;
        }
        if (current == null || current.next == null) {
            System.out.println("Position exceeds the length of the list");
            return;
        }
        current.next = current.next.next;
    }
    // Display the linked list
    void display() {
        AllNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
public class linkedList {
    public static void main(String[] args) {
        LinkedListOne list = new LinkedListOne();
        Scanner sc = new Scanner(System.in);
        System.out.println("choose operation which you want to perform");

        System.out.println("1: for insertion at start");
        System.out.println("2: for insertion at end");
        System.out.println("3: for insertion at middle");
        System.out.println("4: for deletion at start");
        System.out.println("5: for deletion at end");
        System.out.println("6: for deletion at middle");
        int a = sc.nextInt();

        list.insertAtStart(78);
        list.insertAtStart(89);
        list.insertAtStart(54);
        list.insertAtStart(47);
        switch (a){
            case 1:{
                list.insertAtStart(1);
                list.insertAtStart(0);
                break;
            }
            case 2:{
                list.insertAtEnd(3);
                list.insertAtEnd(5);
                break;
            }
            case 3 :{
                list.insertAtMiddle(2, 2);
                list.insertAtMiddle(4, 5);
                break;
            }
            case 4:{
                list.deleteFromStart();
                break;
            }
            case 5:{
                list.deleteFromEnd();
                break;
            }
            case 6:{
                list.deleteFromMiddle(2);
                break;
            }
            default:
                System.out.println("Not an operation");
        }

        list.display();
    }
}
