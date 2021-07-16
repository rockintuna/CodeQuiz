package baekjoon;

import java.util.Scanner;

public class Q4344 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        int students;
        int sum;
        double avg;
        int num;

        for (int i = 0; i < count; i++) {
            sum = 0;
            num = 0;
            students = scan.nextInt();
            int[] scores = new int[students];
            for (int j = 0; j < students; j++) {
                int score = scan.nextInt();
                scores[j] = score;
                sum += score;
            }
            avg = (double) sum/students;
            for (int score : scores) {
                if ( score > avg ) {
                    num += 1;
                }
            }

            System.out.printf("%.3f%%\n", (double) num*100.0/students);

        }
    }
}
