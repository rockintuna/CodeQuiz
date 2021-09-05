package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2292 {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Long num = Long.parseLong(reader.readLine());

        Long x = 0L;
        Long k = 1L;

        while ( 6*x+1 < num ) {
            x = x+k;
            k++;
        }

        System.out.println(k);
    }
}
