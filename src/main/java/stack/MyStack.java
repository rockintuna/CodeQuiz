package stack;

import java.util.Stack;

public class MyStack {

    Stack<Integer> stack = new Stack<>();

    //스택 뒤집기 - 순회
    //또 다른 자료구조 사용 필요
    //시간 복잡도 O(N), 공간 복잡도 O(N)
    public void reverse1() {
        int length = stack.size();
        Stack<Integer> newStack = new Stack<>();

        while (!stack.empty()) {
            newStack.push(stack.pop());
        }
        stack = newStack;
    }

    //스택 뒤집기 - 재귀
    //또 다른 자료구조 사용하지 않고도 가능
    //시간 복잡도 O(N^2), 공간 복잡도 O(N)
    public void reverse2() {
        if (stack.isEmpty()) {
        } else {
            int temp = stack.pop();
            reverse2();
            reverseRecursive(stack, temp);
        }
    }

    private void reverseRecursive(Stack<Integer> stack, Integer num) {
        if (stack.isEmpty()) {
            stack.push(num);
        } else {
            int temp = stack.pop();
            reverseRecursive(stack, num);
            stack.push(temp);
        }
    }


    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.stack.push(1);
        myStack.stack.push(2);
        myStack.stack.push(3);

        //myStack.reverse1();
        myStack.reverse2();

        System.out.println(myStack.stack.pop());
        System.out.println(myStack.stack.pop());
        System.out.println(myStack.stack.pop());
        System.out.println(myStack.stack.isEmpty());
    }
}
