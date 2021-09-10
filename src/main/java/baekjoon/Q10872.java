package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        System.out.println(recursive(n));
    }

    public static int recursive(int num) {
        if ( num == 0 ) {
            return 1;
        }
        return num*recursive(num-1);
    };
}
