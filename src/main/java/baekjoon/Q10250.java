package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10250 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int tests = Integer.parseInt(reader.readLine());

        for (int i = 0; i < tests; i++) {
            String[] test = reader.readLine().split(" ");
            int height = Integer.parseInt(test[0]);
            int weight = Integer.parseInt(test[1]);
            int num = Integer.parseInt(test[2]);
            calc(height, weight, num);
        }
    }

    public static void calc(int height, int weight, int num) {
        int YY;
        int XX;
        if ( num%height == 0 ) {
            YY = height*100;
            XX = num/height;
        } else {
            YY = num%height * 100;
            XX = num/height + 1;
        }
        System.out.println(YY+XX);
    }
}
