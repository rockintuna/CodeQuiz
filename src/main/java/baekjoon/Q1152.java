package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1152 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int count = 0;

        if (str.equals(" ")) {
            System.out.println(count);
        } else {
            for (int i = 0; i < str.length(); i++) {
                if ( str.charAt(i) == ' ' && i != 0 && i != str.length()-1) {
                    count++;
                }
            }
            System.out.println(count+1);
        }
    }
}
