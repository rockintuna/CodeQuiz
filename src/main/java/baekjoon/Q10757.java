package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tests = reader.readLine().split(" ");

        BigInteger big1 = new BigInteger(tests[0]);
        BigInteger big2 = new BigInteger(tests[1]);
        System.out.println(big1.add(big2));
    }
}
