package queue;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    public int size;
    public Map<Integer, Node<Integer>> map;

    public Node<Integer> head, tail;

    public LRUCache(int size) {
        this.size = size;
        this.map = new HashMap<>();
    }

    private class Node<E> {
        public Node(E value) {
            this.value = value;
        }

        E value;
        Node<E> next;
        Node<E> prev;
    }

    //LRU 캐시 구현하기
    //n개 중에서 가장 오래된 값을 삭제하고 number에 해당하는 입력 값을 캐시에 추가하기
    //커스텀 노드와 HashMap을 사용하여 시간 복잡도 줄이기.
    //시간복잡도 O(1), 공간복잡도 O(N)
    public void query(int number) {
        Node<Integer> node;
        if (map.containsKey(number)) { //O(1)
            node = map.get(number);
            removeNode(node); //O(1)
        } else {
            if (map.size() == size) {
                removeNode(map.remove(this.tail.value)); //O(1)
            }
            node = new Node<>(number);
            map.put(number, node); //O(1)
        }
        addTohead(node); //O(1)
    }

    public void removeNode(Node<Integer> node) {
        if ( node.prev == null ) {
            this.head = node.next;
            this.head.prev = null;
        } else if ( node.next == null ) {
            this.tail = node.prev;
            this.tail.next = null;
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
    }

    public void addTohead(Node<Integer> node) {
        if ( this.head == null ) {
            this.tail = node;
        } else {
            this.head.prev = node;
            node.next = this.head;
        }
        this.head = node;
        this.head.prev = null;
    }

    public void print() {
        Node<Integer> node = head;
        while (node!=null) {
            System.out.println(node.value);
            node = node.next;
        }
    }


    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(5);
        lruCache.query(1);
        lruCache.query(2);
        lruCache.query(3);
        lruCache.query(4);
        lruCache.query(5);
        lruCache.query(1);

        lruCache.print();
    }
}
