package baekjoon;

import java.util.Scanner;

public class Q2742 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println(num-i);
        }
    }
}
