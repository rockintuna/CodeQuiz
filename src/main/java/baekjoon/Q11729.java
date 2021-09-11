package baekjoon;

import java.io.*;

public class Q11729 {

    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        writer.write(((int) Math.pow(2, num) - 1) +"\n");
        recursiveTopMove(num,1, 3);

        writer.flush();
        writer.close();
    }

    private static void recursiveTopMove(int num, int from, int to) throws IOException {
        int bridge = 6-from-to;

        if ( num != 1 ) {
            recursiveTopMove(num-1, from, bridge);
            print(from, to);
            recursiveTopMove(num-1, bridge, to);
        } else {
            print(from, to);
        }
    }

    private static void print(int from, int to) throws IOException {
        writer.write(String.valueOf(from)+" "+String.valueOf(to)+"\n");
    }
}
