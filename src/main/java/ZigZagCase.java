import java.util.Arrays;

public class ZigZagCase {

    public static String zigzag(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if ( i % 2 == 0 ) {
                chars[i] = Character.toUpperCase(s.charAt(i));
            } else {
                chars[i] = Character.toLowerCase(s.charAt(i));
            }
        }
        return String.valueOf(chars);

    }

    public static String solution(String s) {
        String[] stringArr = s.split(" ");
        for (String s1 : stringArr) {
            
        }

        String answer = zigzag(stringArr[0]);
        for (int i = 1; i < stringArr.length; i++) {
            String string = stringArr[i];
            answer = answer.concat(" "+zigzag(string));
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("try hello world"));

    }
}
