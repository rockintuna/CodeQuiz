package queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueFactory {

    //큐 뒤집기 - 순회/스택
    //스택에 넣었다가 다시 큐로 꺼내기
    //시간복잡도 O(N), 공간복잡도 O(N)
    public void reverseQueue1(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while ( !queue.isEmpty() ) {
            stack.push(queue.poll());
        }
        while ( !stack.isEmpty() ) {
            queue.offer(stack.pop());
        }
    }

    //큐 뒤집기 - 재귀
    //시간복잡도 O(N), 공간복잡도 O(N)
    public Queue<Integer> reverseQueue2(Queue<Integer> queue) {
        if ( queue.isEmpty() ) {
            return queue;
        } else {
            Integer tempNum = queue.poll();
            queue = reverseQueue2(queue);
            queue.offer(tempNum);
            return queue;
        }
    }


    public static void main(String[] args) {
        QueueFactory queueFactory = new QueueFactory();

        //123456
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        System.out.println(queue);
//        queueFactory.reverseQueue1(queue);
//        System.out.println(queue);
        queueFactory.reverseQueue2(queue);
        System.out.println(queue);
    }
}
