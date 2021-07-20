package baekjoon;

import java.util.Scanner;

public class Q1065 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = scan.nextInt();

        if ( max < 100 ) {
            System.out.println(max);
        } else {
            System.out.println(countAP(max)+99);
        }
    }

    private static int countAP(int max) {
        int count = 0;
        for (int i = 111; i <= max; i++) {
            if ( isAP(i) ) {
                count++;
            }
        }
        return count;
    }

    private static boolean isAP(int num) {
        String stringOfNum = String.valueOf(num);
        int length = stringOfNum.length();
        int head = stringOfNum.charAt(0);
        int diff = head - stringOfNum.charAt(1);

        for (int i = 1; i < length; i++) {
            if ( head - stringOfNum.charAt(i) != diff ) {
                return false;
            }
            head = stringOfNum.charAt(i);
        }
        return true;
    }


}
