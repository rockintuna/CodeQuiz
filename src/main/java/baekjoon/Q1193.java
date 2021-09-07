package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer num = Integer.parseInt(reader.readLine());

        int i=1;
        int sum=2;
        while (i < num) {
            i = i+sum;
            sum++;
        }
        if ( isEven(sum) ) {
            System.out.print(1+i-num);
            System.out.print("/");
            System.out.print(sum-1-i+num);
        } else {
            System.out.print(sum-1-i+num);
            System.out.print("/");
            System.out.print(1+i-num);
        }
    }

    private static boolean isEven(int num) {
        return num%2 == 0;
    }
}
