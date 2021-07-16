package baekjoon;

import java.util.Scanner;

public class Q2562 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            int num = scan.nextInt();
            if ( num > max ) {
                index = i+1;
                max = num;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
