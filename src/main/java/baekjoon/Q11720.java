package baekjoon;

import java.util.Scanner;

public class Q11720 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        String nums = scan.next();
        int sum = 0;

        for ( int i = 0; i < count; i++ ) {
            sum += nums.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
