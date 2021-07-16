package baekjoon;

import java.util.Scanner;

public class Q10818 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        int min = scan.nextInt();
        int max = min;
        int next;

        for (int i = 1; i < count; i++) {
            next = scan.nextInt();
            if ( next < min ) {
                min = next;
            }
            if ( next > max ) {
                max = next;
            }
        }
        System.out.println(String.valueOf(min)+" "+String.valueOf(max));
    }

}
