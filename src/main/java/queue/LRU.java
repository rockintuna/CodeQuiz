package queue;

import java.util.Deque;
import java.util.LinkedList;

public class LRU {

    public int size;
    public Deque<Integer> cache;

    public LRU(int size) {
        this.size = size;
        this.cache = new LinkedList<>();
    }

    //LRU 캐시 구현하기
    //n개 중에서 가장 오래된 값을 삭제하고 number에 해당하는 입력 값을 캐시에 추가하기
    //시간복잡도 O(N), 공간복잡도 O(N)
    public void query1(int number) {
        if (cache.contains(number)) { //O(N)
            cache.remove(number); //O(N)
            cache.addFirst(number);
        } else {
            if (cache.size() == size) {
                cache.removeLast();
            }
            cache.addFirst(number);
        }
    }

    //LRU 캐시 구현하기
    //현재 캐시에 저장된 값을 출력하기
    public void print() {
        System.out.println(this.cache);
    }


    public static void main(String[] args) {
        LRU lru = new LRU(5);
        lru.query1(1);
        lru.query1(2);
        lru.query1(3);
        lru.query1(4);
        lru.query1(5);
        lru.query1(6);
        lru.query1(3);

        lru.print();
    }
}
