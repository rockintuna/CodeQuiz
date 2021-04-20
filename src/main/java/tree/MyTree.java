package tree;

import java.util.Stack;

public class MyTree {

    private static class Node {
        Node left;
        Node right;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }

    //중위탐색 - 재귀
    public void inOrder1(Node root) {
        if ( root == null ) {
            return;
        }

        inOrder1(root.left);
        System.out.print(root.value);
        inOrder1(root.right);
    }

    //중위탐색 - 순회
    public void inOrder2(Node root) {
        if ( root == null ) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (true) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            if (stack.isEmpty()) {
                break;
            }

            current = stack.pop();
            System.out.print(current.value);
            current = current.right;
        }
    }

    //후위탐색에서 n번째 값을 출력하기
    //시간복잡도 O(N), 공간복잡도 O(LogN)
    int count = 0;
    public void postOrder(Node root, int num) {
        if ( root == null ) {
            return;
        }

        postOrder(root.left, num);
        postOrder(root.right, num);
        if ( ++count == num ) {
            System.out.println(root.value);
            count = 0;
        }
    }

    //트리의 높이 구하기
    public int solution(Node root) {
        if ( root == null ) {
            return -1;
        }

        int leftValue = solution(root.left);
        int rightValue = solution(root.right);

        if ( leftValue > rightValue ) {
            return leftValue + 1;
        } else {
            return rightValue + 1;
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);

        //      1
        //    2   3
        //   4 5 6 7
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        MyTree myTree = new MyTree();
        myTree.inOrder1(node1);
        System.out.println("");
        myTree.inOrder2(node1);
        System.out.println("");
        myTree.postOrder(node1, 4);
        System.out.println(myTree.solution(node1));
    }
}
