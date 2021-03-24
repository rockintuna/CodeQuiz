package lists;

public class LinkedList {

    private LinkedNode head;
    private LinkedNode tail;

    private void add(LinkedNode node) {
        if (head == null) {
            head = node;
            tail = node;
        } else if (tail != null) {
            tail.next = node;
            tail = tail.next;
        }
    }

    private void reverse() {

    }
}
