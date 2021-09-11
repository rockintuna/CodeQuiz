package baekjoon;

import java.io.*;

public class Q2447 {
    static char[][] board;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());

        board = new char[n][n];
        recursive(n, 0, 0, true);

        for (int i = 0; i < board.length; i++) {
            writer.write(board[i]);
            writer.write("\n");
        }
        writer.flush();
        writer.close();
    }

    public static void recursive(int n, int x, int y, boolean dot) {

        if ( n == 1) {
            if ( dot ) {
                board[x][y] = '*';
            } else {
                board[x][y] = ' ';
            }
        } else if ( !dot ) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    recursive(n/3, x + i*n/3, y + j*n/3, false);
                }
            }
        } else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if ( i == 1 && j == 1 ) {
                        recursive(n/3, x + i*n/3, y + j*n/3, false);
                    } else {
                        recursive(n/3, x + i*n/3, y + j*n/3, true);
                    }
                }
            }
        }
    }

}
