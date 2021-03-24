package arrays;

public class ReverseCharArray {

    //시간복잡도 O(N), 공간복잡도 O(N)
    public char[] solution1(char[] chars) {
        char[] newChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            newChars[chars.length-1-i] = chars[i];
        }
        return newChars;
    }

    //별도의 배열을 사용하지 않고 배열 swap을 이용하여 공간복잡도 낮추기
    //시간복잡도 O(N), 공간복잡도 O(1)
    public char[] solution2(char[] chars) {
        for (int i = 0; i < chars.length/2; i++) {
            char tmpChar = chars[i];
            chars[i] = chars[chars.length-1-i];
            chars[chars.length-1-i] = tmpChar;
        }
        return chars;
    }

    public static void main(String[] args) {
        ReverseCharArray reverseString = new ReverseCharArray();
        String str = "Happy New Year";
        System.out.println(reverseString.solution1(str.toCharArray()));
        System.out.println(reverseString.solution2(str.toCharArray()));
    }
}
