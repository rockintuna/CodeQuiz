package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Q2839 {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static int result;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(reader.readLine());
//        Set<Integer> resultSet = new TreeSet<>();
//
//        for (int i = n/5; i >= 0; i--) {
//            if ( (n - 5*i) == 0 ) {
//                resultSet.add(i);
//            } else if ( (n - 5*i)%3 == 0) {
//                resultSet.add(i + ((n - 5*i)/3));
//            }
//        }
//        if ( resultSet.isEmpty() ) {
//            System.out.println(-1);
//        } else {
//            System.out.println(resultSet.toArray()[0]);
//        }
        if (n == 4 || n == 7) {
            result = -1;
        } else if (n % 5 == 0) {
            result = n/5;
        } else if (n % 5 == 1 || n % 5 == 3) {
            result = (n/5) + 1;
        } else if (n % 5 == 2 || n % 5 == 4) {
            result = (n/5) + 2;
        }
        System.out.println(result);
    }
}
