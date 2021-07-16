package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q3052 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] nums = new int[10];
        int count = 1;

        for (int i = 0; i < 10; i++) {
            nums[i] = scan.nextInt()%42;
        }

        Arrays.sort(nums);
        int prov = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if ( nums[i] != prov ) {
                count++;
                prov = nums[i];
            }
        }
        System.out.println(count);
    }
}
