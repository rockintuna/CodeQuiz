package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Qtest {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int val1 = scan.nextInt();
        int val2 = scan.nextInt();
        System.out.println(val1+val2);
    }
}