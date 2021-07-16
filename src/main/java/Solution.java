import java.util.Scanner;
import java.util.Stack;

class Solution {
    public void solution() {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        while ( num != 0 ) {
            Stack<Integer> stack = new Stack<>();
            stack.push(1);
            recursive(stack, new StringBuilder(), num, 1);
            System.out.println("");
            num = scan.nextInt();
        }
    }

    public void recursive(Stack<Integer> stack, StringBuilder result, int num, int depth) {
        if ( depth == num ) {
            Stack<Integer> temp = (Stack<Integer>) stack.clone();
            while ( !temp.empty() ) {
                result.append(temp.pop());
            }
            System.out.println(result);
            result.setLength(0);
        } else {
            for (int i = 0; i <= stack.size(); i++) {
                Stack<Integer> temp = (Stack<Integer>) stack.clone();
                StringBuilder base = new StringBuilder(result);
                int count = i;

                while (count != 0) {
                    base.append(temp.pop());
                    count--;
                }

                temp.push(depth + 1);

                recursive(temp, base, num, depth + 1);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution();
    }
}