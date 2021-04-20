package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyStack<T> extends Stack<T> {

    Queue<T> queue = new LinkedList<>();

    //Queue로 Stack을 구현하기
    @Override
    public T pop() {
        Queue<T> tempQueue = new LinkedList<>();
        while (queue.size() > 1) {
            tempQueue.offer(queue.poll());
        }
        T result = queue.poll();
        queue = tempQueue;
        return result;
    }

    @Override
    public synchronized T peek() {
        Queue<T> tempQueue = new LinkedList<>();
        while (queue.size() > 1) {
            tempQueue.offer(queue.poll());
        }
        T result = queue.peek();
        tempQueue.offer(queue.poll());
        queue = tempQueue;
        return result;
    }

    @Override
    public T push(T item) {
        queue.offer(item);
        return item;
    }

    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.queue);
        System.out.println(myStack.peek());
        System.out.println(myStack.peek());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
