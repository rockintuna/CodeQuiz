package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2775 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static int[][] apt = new int[15][14];
    static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 14; i++) {
            apt[0][i] = i+1;
        }

        for (int i = 1; i < apt.length; i++) {
            apt[i][0] = 1;
            for (int j = 1; j < apt[i].length; j++) {
                apt[i][j] = apt[i-1][j] + apt[i][j-1];
            }
        }

        int tests = Integer.parseInt(reader.readLine());
        for (int i = 0; i < tests; i++) {
            int k = Integer.parseInt(reader.readLine());
            int n = Integer.parseInt(reader.readLine());
            builder.append(apt[k][n-1]).append('\n');
        }
        System.out.println(builder);
    }

}
