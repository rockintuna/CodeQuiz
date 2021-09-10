package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;

public class Q2447 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        recursive(n);
        Collections.unmodifiableList()
    }

    public static void recursive(int n) {
        if ( n == 0 ) {
            System.out.print("*");
        } else {
            recursive(n/3);
            recursive(n/3);
            recursive(n/3);
            System.out.println("");
            recursive(n/3);

        }
    }


}
