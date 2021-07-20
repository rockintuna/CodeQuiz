package baekjoon;

import java.util.Scanner;

public class Q2675 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int repeat;
        String str;

        for ( int i = 0; i < count; i++ ) {
            repeat = scan.nextInt();
            str = scan.next();
            System.out.println(repeatString(str, repeat));
        }
    }

    public static String repeatString(String str, int repeat) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            for ( int j = 0; j < repeat; j++ ) {
                builder.append(str.charAt(i));
            }
        }

        return builder.toString();
    }
}
