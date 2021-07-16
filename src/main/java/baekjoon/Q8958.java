package baekjoon;

import java.util.Scanner;

public class Q8958 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int total = 0;
        int sum = 0;
        int score = 0;

        for (int i = 0; i < count; i++) {
            String ox = scan.next();

            for (int j = 0; j < ox.length(); j++) {
                char ch = ox.charAt(j);

                if ( ch == 'O' && j < ox.length()-1 ) {
                    score += 1;
                    sum += score;
                } else if ( ch == 'X' ) {
                    total += sum;
                    sum = 0;
                    score = 0;
                } else {
                    score += 1;
                    sum += score;
                    total += sum;
                    sum = 0;
                    score = 0;
                }
            }

            System.out.println(total);
            total=0;
        }
    }
}
