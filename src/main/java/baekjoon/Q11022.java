package baekjoon;

import java.util.Scanner;

public class Q11022 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        for (int i = 1; i <= count; i++) {
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            int sum = num1+num2;
            System.out.println("Case #"+String.valueOf(i)+": "+
                    String.valueOf(num1)+" + "+
                    String.valueOf(num2)+" = "+
                    String.valueOf(sum));
        }
    }
}
