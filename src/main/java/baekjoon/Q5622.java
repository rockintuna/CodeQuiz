package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5622 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
           count += secondsByChar(str.charAt(i));
        }

        System.out.println(count);
    }

    public static int secondsByChar(char c) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int index = alphabet.indexOf(c);
        if ( index < 3 ) {
            return 3;
        } else if ( index < 6 ) {
            return 4;
        } else if ( index < 9 ) {
            return 5;
        } else if ( index < 12 ) {
            return 6;
        } else if ( index < 15 ) {
            return 7;
        } else if ( index < 19 ) {
            return 8;
        } else if ( index < 22 ) {
            return 9;
        } else {
            return 10;
        }
    }

}
