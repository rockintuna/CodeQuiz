package queue;

import java.util.LinkedHashSet;

public class NewLRUCache {

    public int size;
    public LinkedHashSet<Integer> set;

    public NewLRUCache(int size) {
        this.size = size;
        this.set = new LinkedHashSet<>();
    }

    //LRU 캐시 구현하기
    //n개 중에서 가장 오래된 값을 삭제하고 number에 해당하는 입력 값을 캐시에 추가하기
    //자바에서 제공하는 LinkedHashSet을 사용하여 HashSet과 달리 순서를 보장할 수 있다.
    //LinkedHashSet은 LRU 캐시에 매우 최적화된 자료구조이다.
    //시간복잡도 O(1), 공간복잡도 O(N)
    public void query(int number) {
        if ( set.contains(number) ) { //O(1)
            set.remove(number); //O(1)
            set.add(number); //O(1)
        } else {
            if ( set.size() == size ) {
                set.remove(set.iterator().next()); //O(1)
            }
            set.add(number); //O(1)
        }
    }

    //LRU 순서의 반대로 출력된다.
    //필요시 LRU 순서로 출력하려면 reverse 구현해야함.
    public void print() {
        System.out.println(set);
    }


    public static void main(String[] args) {
        NewLRUCache lruCache = new NewLRUCache(5);
        lruCache.query(1);
        lruCache.query(2);
        lruCache.query(3);
        lruCache.query(4);
        lruCache.query(5);
        lruCache.query(1);

        lruCache.print();
    }
}
