package lists;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

    private void print() {
        LinkedNode node = this.head;
        while ( node != null ) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    //단일 연결 리스트를 뒤집는 함수 - 순회
    //시간 복잡도 O(N), 공간 복잡도 O(1)
    private void reverse1() {
        LinkedNode current = this.head;
        LinkedNode previous = null;
        LinkedNode next = null;


        while ( current != null ) {
            next = current.next;

            current.next = previous;

            previous = current;
            current = next;
        }

        this.tail = this.head;
        this.head = previous;
    }

    //단일 연결 리스트를 뒤집는 함수 - 재귀
    //시간 복잡도 O(N), 공간 복잡도 O(N)
    private void reverse2() {
        LinkedNode head = this.head;
        this.head = reverseRecursive(head);
        this.tail = head;
    }

    private LinkedNode reverseRecursive(LinkedNode node) {
        if ( node == null || node.next == null ) {
            return node;
        }
        LinkedNode newHead = reverseRecursive(node.next);
        node.next.next = node;
        node.next = null;
        return newHead;
    }

    //단일 연결 리스트에서 끝에서 n번째에 위치한 노드 - 순회
    //시간 복잡도 O(N^2), 공간 복잡도 O(1)
    private LinkedNode findFromLast1(int n) {
        LinkedNode node = this.head;
        LinkedNode next = null;
        while ( node != null ) {
            next = node.next;
            int count = 0;
            while ( next != null ) {
                next = next.next;
                count++;
            }
            if ( count == n - 1 ) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    //단일 연결 리스트에서 끝에서 n번째에 위치한 노드 - 두번 순회
    //시간 복잡도 O(N), 공간 복잡도 O(1)
    private LinkedNode findFromLast2(int n) {
        LinkedNode node = this.head;
        int count=0;
        while ( node != null ) {
            node = node.next;
            count++;
        }
        node = this.head;
        while ( count-n > 0 ) {
            node = node.next;
            count--;
        }
        return node;
    }

    //단일 연결 리스트에서 끝에서 n번째에 위치한 노드 - HashMap
    //시간 복잡도 O(N), 공간 복잡도 O(N)
    private LinkedNode findFromLast3(int n) {
        Map<Integer, LinkedNode> map = new HashMap<>();
        LinkedNode node = this.head;
        int index = 0;
        while ( node != null ) {
            map.put(index++, node);
            node = node.next;
        }

        return map.get(map.size() - n);
    }

    //단일 연결 리스트에서 끝에서 n번째에 위치한 노드 - 순회, 포인터 추가
    //시간 복잡도 O(N), 공간 복잡도 O(1)
    private LinkedNode findFromLast4(int n) {
        LinkedNode left = this.head;
        LinkedNode right = this.head;
        int count = 0;

        while ( right != null ) {
            if ( right.next == null) {
                return left;
            }
            right = right.next;

            if ( count + 1 == n ) {
                left = left.next;
            } else {
                count++;
            }
        }

        return null;
    }

    //정렬될 연결 리스트에서 값이 중복된 노드 제거하기 - 순회
    //시간 복잡도 O(N), 공간 복잡도 O(1)
    private void removeDup1() {
        LinkedNode current = this.head;
        LinkedNode next;

        while ( current != null ) {
            next = current;
            while ( next != null && next.val == current.val ) {
                next = next.next;
            }
            current.next = next;
            current = current.next;
        }
    }

    //정렬될 연결 리스트에서 값이 중복된 노드 제거하기 - 순회, 포인터 추가
    //시간 복잡도 O(N), 공간 복잡도 O(1)
    private void removeDup2() {
        if ( this.head == null ) {
            return;
        }
        LinkedNode previous = this.head;
        LinkedNode current = previous.next;

        while ( current != null ) {
            previous.next = null;
            if ( previous.val != current.val ) {
                previous.next = current;
                previous = current;
            }
            current = current.next;
        }
        this.tail = previous;
    }

    //정렬될 연결 리스트에서 값이 중복된 노드 제거하기 - 재귀1
    //시간 복잡도 O(N), 공간 복잡도 O(N)
    private void removeDup3() {
        removeDupRecursive1(this.head);
    }

    private LinkedNode removeDupRecursive1(LinkedNode node) {
        if ( node == null || node.next == null) {
            return null;
        } else if ( node.val == node.next.val ) {
            node.next = removeDupRecursive1(node.next);
            return node.next;
        } else {
            removeDupRecursive1(node.next);
            return node.next;
        }
    }

    //정렬될 연결 리스트에서 값이 중복된 노드 제거하기 - 재귀2
    //시간 복잡도 O(N), 공간 복잡도 O(N)
    private void removeDup5() {
        removeDupRecursive2(this.head);
    }

    private LinkedNode removeDupRecursive2(LinkedNode node) {
        if ( node.next == null ) {
            return node;
        }

        if ( node.val == node.next.val ) {
            node.next = node.next.next;
            removeDupRecursive2(node);
        } else {
            removeDupRecursive2(node.next);
        }
        return node;
    }

    //정렬될 연결 리스트에서 값이 중복된 노드 제거하기 - HashSet
    //시간 복잡도 O(N), 공간 복잡도 O(N)
    private void removeDup4() {

        LinkedNode current = this.head;
        LinkedNode previous = null;
        Set<Integer> set = new HashSet<>();

        while ( current != null ) {
            if (set.add(current.val)) {
                previous = current;
            } else {
                previous.next = current.next;
            }
            current = current.next;
        }

    }


    //원형 연결 리스트인지 확인하기 - HashSet
    //일반적인 순회를 하는 방법으로는 무한 루프에 빠질 수 있다.
    //시간 복잡도 O(N), 공간 복잡도 O(N)
    private boolean isCircle1() {
        LinkedNode current = this.head;
        Set<LinkedNode> set = new HashSet<>();

        while (current != null) {
            if ( !set.add(current) ) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    //원형 연결 리스트인지 확인하기 - 트랙
    //시간 복잡도 O(N), 공간 복잡도 O(1)
    private boolean isCircle2() {
        LinkedNode fast = this.head;
        LinkedNode slow = null;
        int count = 0;

        while (fast != null) {
            if ( fast == slow ) {
                return true;
            }
            if ( count == 1 ) {
                slow = this.head;
            } else if ( count%2 == 1 ) {
                slow = slow.next;
            }
            count++;
            fast = fast.next;
        }
        return false;
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedNode node = new LinkedNode(1);
        list.add(node);
        list.add(new LinkedNode(1));
        list.add(new LinkedNode(1));
        list.add(new LinkedNode(1));
        list.add(new LinkedNode(2));
        list.add(new LinkedNode(3));
        list.add(new LinkedNode(3));
        list.add(new LinkedNode(3));
        list.add(node);

        System.out.println(list.isCircle1());
        System.out.println(list.isCircle2());
    }

}
