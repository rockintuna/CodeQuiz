package programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test2 {

    public int[] solution(int[][] data) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();
        LinkedList<Integer> queue = new LinkedList<>();
        result.add(data[0][0]);

        int duration = data[0][1];
        for (int i = 0; i < data.length; i++) {
            duration += data[i][2];
        }

        int nextPage = 2;
        int timeForCurrentPageEnd = data[0][1] + data[0][2];

        for (int time = 0; time < duration; time++) {
            if ( data[nextPage][1] == time ) {
                if ( queue.isEmpty() ) {
                    queue.add(nextPage);
                } else {
                    int index = 0;
                    for (int i = 0; i < queue.size(); i++) {
                        if ( data[queue.get(i)][2] > data[nextPage][2] ) {
                            index += 1;
                        } else {
                            break;
                        }
                    }
                    queue.add(index, nextPage);
                }
                nextPage += 1;
            }

            if ( time == timeForCurrentPageEnd ) {
                if (queue.isEmpty()) {
                    break;
                } else {
                    timeForCurrentPageEnd += data[queue.get(queue.size() - 1)][2];
                    result.add(queue.pollLast());
                }
            }
        }
        return answer;
    }
}
