package stack;

import java.util.Stack;

public class PostFix {

    //포스트픽스 계산식 - 스택/순회
    //시간복잡도 O(N), 공간복잡도 O(N)
    public int solution(String expression) {

        Stack<Integer> stack = new Stack<>();
        char[] chars = expression.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int rNum;
            int lNum;
            switch ( chars[i] ) {
                case '+':
                    rNum = stack.pop();
                    lNum = stack.pop();
                    stack.push(lNum+rNum);
                    break;
                case '-':
                    rNum = stack.pop();
                    lNum = stack.pop();
                    stack.push(lNum-rNum);
                    break;
                case '*':
                    rNum = stack.pop();
                    lNum = stack.pop();
                    stack.push(lNum*rNum);
                    break;
                case '/':
                    rNum = stack.pop();
                    lNum = stack.pop();
                    stack.push(lNum/rNum);
                    break;
                default:
                    stack.push(Integer.valueOf(String.valueOf(chars[i])));
            }
        }
        return stack.pop();
    }

    //포스트픽스 변환식 - 스택/순회
    //시간복잡도 O(N), 공간복잡도 O(N)
    public String infixToPostfix(String expression) {

        Stack<Character> stack = new Stack<>();
        char[] chars = expression.toCharArray();
        String result = "";

        for (int i = 0; i < chars.length; i++) {
            if ( Character.isDigit(chars[i]) ) {
                result = result.concat(String.valueOf(chars[i]));
            } else if ( stack.isEmpty() || chars[i] == '(' ) {
                stack.push(chars[i]);
            } else {

                switch (chars[i]) {
                    case ')':
                        int length =  stack.size();
                        for ( int j = 0; j<length; j++) {
                            if (stack.peek() != '(') {
                                result = result.concat(String.valueOf(stack.pop()));
                            } else {
                                stack.pop();
                                break;
                            }
                        }
                        break;
                    case '+': case '-':
                        if ( stack.peek() == '*' || stack.peek() == '/' ) {
                            result = result.concat(String.valueOf(chars[i]));
                        } else {
                            stack.push(chars[i]);
                        }
                        break;
                    case '*': case '/':
                        stack.push(chars[i]);
                        break;
                    default:
                        return "invalid";
                }
            }
        }
        int length =  stack.size();
        for ( int i = 0; i<length; i++) {
            result = result.concat(String.valueOf(stack.pop()));
        }
        return result;
    }

    public static void main(String[] args) {
        PostFix postFix = new PostFix();
        System.out.println(postFix.solution("521+-9*"));
        System.out.println(postFix.solution("52/"));
        System.out.println(postFix.solution("123+-5*"));
        System.out.println(postFix.solution("5123+-*"));

        System.out.println(postFix.infixToPostfix("1+2*3"));
        System.out.println(postFix.infixToPostfix("(1+2)*3"));
    }

}
