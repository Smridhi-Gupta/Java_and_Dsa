package linkedList;

public class LinkedList {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data) {
        // step 1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 = newNode next = head
        newNode.next = head; //link
// 10->1->2->null
        // step3 = head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Ll is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addAnywhere(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1 ) {
            temp = temp.next;
            i++;
        }
        // i = index - 1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i = size - 2
        Node prev = head;
        for (int i = 0; i < size - 2 ; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) { // key found
                return i;
            }
            temp = temp.next;
            i++;
        }

        // key not found
        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthFromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next; // remove first
            return;
        }
        // sz-n
        int i = 1;
        int itoFind = sz-n;
        Node prev = head;
        while (i < itoFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public  Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next == null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is my midNode
    }

    public boolean checkPalindrome() {
        if (head == null || head.next != null) { // empty or 1 element
            return true;
        }
        // step 1 - find mid
        Node midNode = findMid(head);

        // step 2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head;

        // step 3 - check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean isCycle() { // Floyd's Cycle Finding Algorithm
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                return true; // cycle exists
            }
        }

        return false; // cycle doesn't exist
    }

    public static void removeCycle() {
        // detect cycle
        Node slow = head; // slow or fast dono head pe h
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (fast == slow) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        // find meeting point
        slow = head; // cycle milgya to slow frse head pe point krra h ab
        Node prev = null; // after loop completion isme last node store hoga
        while (slow != fast) { // jab tak slow fast nyi milte
            prev = fast;
            slow = slow.next; // +1
            fast = fast.next; // +1
        }

        // remove cycle -> last.next = null
        prev.next = null;
    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid node
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL; // temp is ponting to merged linked list head

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1; // jhn choti value h wahn head krra h = head1
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2; // agr head2 chota h to ispe point krega temp
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        // ek value ya khali linked list
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);

        // left right half ke liye call mergesort
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);
    }

    public void zigZag() {
        // find mid
        Node slow = head; // slow pointer starting from 1st node
        Node fast = head.next; // fast pointer starting from 2nd node
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        Node mid = slow;

        // reverse 2nd half
        Node curr = mid.next; // mid k next wali value
        mid.next = null; // for breaking
        Node prev = null;
        Node next;
         while (curr != null) {
             next = curr.next;
             curr.next= prev;
             prev = curr;
             curr = next;
         }
         Node left = head;
         Node right = prev;
         Node nextL, nextR;

        // alternate merge - zig-zag merge
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
//        ll.print();
//
//        ll.addFirst(2);
//        ll.print();
//
//        ll.addFirst(1);
//        ll.print();
//
//        ll.addLast(3);
//        ll.print();
//
//        ll.addLast(4);
//        ll.print();
//
//        ll. addAnywhere(2, 9);
//        ll.print();
//        System.out.println(ll.size);
//        ll.removeFirst();
//        ll.print();
//
//        ll.removeLast();
//        ll.print();
//        System.out.println(ll.size);
//
//        System.out.println(ll.itrSearch(3));
//
//        System.out.println(ll.recSearch(3));
//        ll.reverse();
//        ll.print();
//
//        ll.deleteNthFromEnd(2);
//        ll.print();
//
//        ll.addFirst(10);
//        ll.addFirst(11);
//        ll.addFirst(12);
//        ll.addFirst(13);
//        ll.print();

//        ll.addLast(1);
//        ll.addLast(2);
//        ll.addLast(2);
//        ll.addLast(1);
//
//        ll.print(); // 1->2->2->1
//        System.out.println(ll.checkPalindrome());

//        head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = head;
//        // 1->2->3->1
//        System.out.println(isCycle());

//        head = new Node(1);
//        Node temp = new Node(2);
//        head.next = temp;
//        head.next.next = new Node(3);
//        head.next.next.next = temp;
//        // 1->2->3->2
//        System.out.println(isCycle());
//        removeCycle();
//        System.out.println(isCycle());

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        // 1->2->3->4->5

        ll.print();
//        ll.head = ll.mergeSort(ll.head);
        ll.zigZag();
        ll.print();
    }
}
