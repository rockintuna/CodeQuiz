package baekjoon;

import java.util.Scanner;

public class Q1110 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int val = num;
        int num1, num2, sum;
        int count = 0;

        while ( true ) {
            num1 = val/10;
            num2 = val%10;

            sum = num1+num2;
            val = num2*10+sum%10;
            count++;
            if ( val == num ) {
                break;
            }
        }

        System.out.println(count);

    }
}
