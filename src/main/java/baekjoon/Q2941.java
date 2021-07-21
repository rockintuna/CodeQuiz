package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2941 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        System.out.println(countFrom(str));
    }

    private static int countFrom(String str) {
        int count = 0;

        String[] croatiaCharset = new String[8];
        croatiaCharset[0] = "c=";
        croatiaCharset[1] = "c-";
        croatiaCharset[2] = "dz=";
        croatiaCharset[3] = "d-";
        croatiaCharset[4] = "lj";
        croatiaCharset[5] = "nj";
        croatiaCharset[6] = "s=";
        croatiaCharset[7] = "z=";

        for (String croatia : croatiaCharset) {
            count += countStringFromString(croatia, str);
        }
        return count;
    }

    private static int countStringFromString(String croatia, String str) {
        StringBuilder builder = new StringBuilder(str);
        int count = 0;
        int index;

        while ( builder.indexOf(croatia) != -1 ) {
            count++;
            index = builder.indexOf(croatia);
            builder.delete(0, index);
        }

        return count;

    }
}
