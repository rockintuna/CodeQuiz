package stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BracketCount {

    //주어진 수식의 괄호짝이 맞는지 체크
    //시간복잡도 O(N) , 공간복잡도 O(N)
    public boolean solution1(String expression) {
        List<Character> open = Arrays.asList('(','{','[');
        List<Character> close = Arrays.asList(')','}',']');
        Stack<Character> stack = new Stack<>();

        char[] chars = expression.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ( open.contains(chars[i]) ) {
                stack.push(close.get(open.indexOf(chars[i])));
            } else if ( close.contains(chars[i]) ) {
                if ( stack.isEmpty() || stack.pop() != chars[i] ) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        BracketCount bracketCount = new BracketCount();
        System.out.println(bracketCount.solution1("[{(1+2)-1}+10]"));
        System.out.println(bracketCount.solution1("[[{(1+2)-1}+10]"));
        System.out.println(bracketCount.solution1("[{(1+2)-1)+10]"));
    }
}
