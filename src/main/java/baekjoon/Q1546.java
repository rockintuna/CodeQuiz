package baekjoon;

import java.util.Scanner;

public class Q1546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int sum = 0;
        int max = 0;
        int score;
        float result;

        for (int i = 0; i < count; i++) {
            score = scan.nextInt();
            max = Math.max(max, score);
            sum += score;
        }

        result = (sum*100f/count)/max;
        System.out.println(result);
    }
}
