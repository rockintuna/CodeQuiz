package baekjoon;

import java.util.Scanner;

public class Q10951 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;

        while ( scan.hasNext() ) {
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            System.out.println(num1+num2);
        }
    }
}
