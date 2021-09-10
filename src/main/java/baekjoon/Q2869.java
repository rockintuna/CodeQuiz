package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2869 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] nums = reader.readLine().split(" ");
        int up = Integer.parseInt(nums[0]);
        int down = Integer.parseInt(nums[1]);
        int height = Integer.parseInt(nums[2]);
        int day = 0;

        day += (height-up)/(up-down);
        if ( (height-up)%(up-down) > 0) {
            day += 2;
        } else {
            day += 1;
        }
        System.out.println(day);
    }
}
