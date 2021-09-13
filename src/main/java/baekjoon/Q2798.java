package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q2798 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] test = reader.readLine().split(" ");
        String[] cardsInput = reader.readLine().split(" ");
        int cardCount = Integer.parseInt(test[0]);
        int max = Integer.parseInt(test[1]);
        int result = 0;
        int sum;
        List<Integer> cards = new ArrayList<>();

        for (int i = 0; i < cardsInput.length; i++) {
            cards.add(Integer.parseInt(cardsInput[i]));
        }

        for (int i = 0; i < cardCount-2; i++) {
            for (int j = i+1; j < cardCount-1; j++) {
                for (int k = j+1; k < cardCount; k++) {
                    sum = cards.get(i) + cards.get(j) + cards.get(k);
                    System.out.println(sum);
                    if ( sum <= max ) {
                        result = Math.max(result, sum);
                    }
                }
            }
        }
        System.out.println(result);
    }
}
