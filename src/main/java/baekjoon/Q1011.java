package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1011 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(reader.readLine());
        int dist;
        int max;
        int result;

        for (int i = 0; i < tests; i++) {
            String[] test = reader.readLine().split(" ");
            dist = Integer.parseInt(test[1]) - Integer.parseInt(test[0]);
            System.out.println("dist:"+ dist);
            max = (int) Math.sqrt(dist);
            System.out.println("max:"+ max);

            result = max*2 - 1;
            int pow = (int) Math.pow(max, 2);
            if ( dist == pow ) {
                System.out.println(result);
            } else if ( dist <= pow + max ) {
                System.out.println(result+1);
            } else {
                System.out.println(result+2);
            }
        }
    }
}
