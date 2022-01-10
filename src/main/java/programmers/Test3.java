package programmers;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Test3 {

    public int solution(int[] histogram) {
        int answer = -1;
        for (int i = 0; i < histogram.length-2; i++) {
            for (int j = i+2; j < histogram.length; j++) {
                int size = getHistogramArea(histogram, i, j);
                answer = max(answer, size);
            }
        }
        return answer;
    }

    private int getHistogramArea(int[] histogram, int first, int second) {
        int height = second-first-1;
        int width = min(histogram[first], histogram[second]);
        return height * width;
    }
}
