package lists;

import java.util.Objects;

public class LinkedNode {
      int val;
      LinkedNode next;

      LinkedNode() {}LinkedNode(int val) {
          this.val = val;
      }

      LinkedNode(int val, LinkedNode next) {
          this.val = val; this.next = next;
      }
}