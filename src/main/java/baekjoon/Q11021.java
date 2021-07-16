package baekjoon;

import java.util.Scanner;

public class Q11021 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        for (int i = 1; i <= count; i++) {
            int sum = scan.nextInt();
            sum += scan.nextInt();
            System.out.println("Case #"+String.valueOf(i)+": "+String.valueOf(sum));

        }
    }
}
