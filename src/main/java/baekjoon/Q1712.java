package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1712 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int fixed = Integer.parseInt(str.split(" ")[0]);
        int variable = Integer.parseInt(str.split(" ")[1]);
        int price = Integer.parseInt(str.split(" ")[2]);
        int profit = price-variable;

        if ( profit <= 0 ) {
            System.out.println(-1);
        } else {
            System.out.println(fixed/profit+1);
        }
    }
}
