package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTree {

    Node root;

    private static class Node {
        Node left;
        Node right;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }

    //바이너리 트리의 층 합계 중 최대값 구하기 - Queue
    //
    //시간복잡도 O(N), 공간복잡도 O(B),B=트리의 최대 넓이
    public int maxSumOfTree(Node root) {
        if ( root == null ) {
            return 0;
        }

        int max = root.value;
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(root);

        while ( !queue.isEmpty() ) {
            int size = queue.size();
            int sum = 0;
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                sum += node.value;
                if ( node.left != null ) {
                    queue.offer(node.left);
                }
                if ( node.right != null ) {
                    queue.offer(node.right);
                }
            }
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        //Node node7 = new Node(7);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        //node3.right = node7;

        System.out.println(binaryTree.maxSumOfTree(node1)==15);
    }
}
