package baekjoon;

import java.util.Scanner;

public class Q2577 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        String value = String.valueOf(a * b * c);
        int[] result = new int[10];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < value.length(); j++) {
                if ( value.charAt(j) == Character.forDigit(i,10) ) {
                    result[i] = result[i]+1;
                }
            }
        }

        for (int i : result) {
            System.out.println(i);
        }
    }
}
