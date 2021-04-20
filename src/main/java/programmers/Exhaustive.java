package programmers;

import java.util.ArrayList;
import java.util.List;

public class Exhaustive {

    public int[] solution(int[] answers) {
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {2,1,2,3,2,4,2,5};
        int[] nums3 = {3,3,1,1,2,2,4,4,5,5};

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if ( answers[i] == nums1[i%5] ) {
                count1++;
            }
            if ( answers[i] == nums2[i%8] ) {
                count2++;
            }
            if ( answers[i] == nums3[i%10] ) {
                count3++;
            }
        }

        List<Integer> temp = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(count1);
        list.add(count2);
        list.add(count3);
        int max = Math.max(count1, Math.max(count2, count3));
        for (int i = 0; i < list.size(); i++) {
            if ( list.get(i) == max ) {
                temp.add(i+1);
            }
        }

        int[] answer = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        return answer;
    }

}
