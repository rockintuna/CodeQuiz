package tree;

import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        return answer;
    }

    public void recursive(int[] numbers) {
        Arrays.sort(numbers);
        int[] temp = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if ( numbers[i] < 10 ) {
                temp[i] = numbers[i];
            } else if ( numbers[i] < 100 ) {
                temp[i] = numbers[i]/10;
            } else {
                temp[i] = numbers[i]/100;
            }
        }
        Arrays.sort(temp);
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < temp.length; i++) {
            set.add(temp[temp.length-1-i]);
        }
        System.out.println(set);
        List<Integer> list = null;
        for (Integer num : set) {
            list = new ArrayList<>();
            for (int i = 0; i < numbers.length; i++) {
                if ( numbers[i] == num || numbers[i]/10 == num || numbers[i]/100 == num) {
                    list.add(numbers[i]);
                }
            }

        }
        System.out.println(list);


    }

    public static void main(String[] args) {
        int[] array = {3, 30, 34, 5, 9, 90, 94};

        Solution solution = new Solution();
        System.out.println(solution.solution(array));
        solution.recursive(array);
    }
}