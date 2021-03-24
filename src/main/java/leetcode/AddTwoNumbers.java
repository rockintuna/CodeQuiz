package leetcode;

import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNumbers {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode currentNode = new ListNode();
        ListNode head = currentNode;
        int carry = 0;
        while (l1!=null || l2!=null) {
            if (carry > 0) {
                currentNode.val = 1;
                carry = 0;
            }
            if ( l1==null ) {
                currentNode.val += l2.val;
                if ( currentNode.val >= 10) {
                    carry++;
                    currentNode.val -= 10;
                }
                l2 = l2.next;
            } else if (l2==null) {
                currentNode.val += l1.val;
                if ( currentNode.val >= 10) {
                    carry++;
                    currentNode.val -= 10;
                }
                l1 = l1.next;
            } else {
                currentNode.val += l1.val + l2.val;
                if ( currentNode.val >= 10) {
                    carry++;
                    currentNode.val -= 10;
                }
                l1 = l1.next;
                l2 = l2.next;
            }
            if (l1!=null || l2!=null) {
                currentNode.next = new ListNode();
                currentNode = currentNode.next;
            } else if ( carry > 0 ) {
                currentNode.next = new ListNode(1);
            }
        }
        return head;
    }

}
