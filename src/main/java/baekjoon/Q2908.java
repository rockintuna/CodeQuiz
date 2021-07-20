package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2908 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] sArr = str.split(" ");

        int max = 0;
        for (String s : sArr) {
            max = Math.max(max, reverse(s));
        }
        System.out.println(max);
    }

    public static Integer reverse(String str) {
        StringBuilder builder = new StringBuilder();
        int length = str.length();
        for ( int i = 0; i < length; i++ ) {
            builder.append(str.charAt(length-i-1));
        }
        return Integer.valueOf(builder.toString());
    }
}
