package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10870 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        System.out.println(recursive(n));
    }

    private static int recursive(int n) {
        if ( n == 0 || n == 1) {
            return n;
        } else {
            return recursive(n - 1) + recursive(n - 2);
        }
    }
}
