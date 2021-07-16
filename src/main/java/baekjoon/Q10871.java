package baekjoon;

import java.util.Scanner;

public class Q10871 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int critic = scan.nextInt();

        for (int i = 0; i < count; i++) {
            int num = scan.nextInt();
            if ( num < critic ) {
                System.out.print(num+" ");
            }
        }

    }
}
