package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 숫자로 구성된 배열이 주어졌을 때 그 배열에 중복된 숫자가 있는지 확인하는 함수를 작성하라.
// 중복된 숫자가 있다면 true 없다면 false.
public class DupCheck {

    // 시간 복잡도 O(N^2), 공간 복잡도 O(1)
    // 시간 복잡도가 너무 높음.
    public boolean solution1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if ( nums[i] == nums[j] ) {
                    return true;
                }
            }
        }
        return false;
    }

    // 시간 복잡도 O(NlogN), 공간 복잡도 O(logN)
    // 배열을 정렬시켜서 순회를 한번만 할 수 있다.
    // 즉 시간 복잡도를 줄일 수 있다.
    // 정렬의 시간 복잡도는 O(NlogN), 공간 복잡도는 O(logN) 이다.
    public boolean solution2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if ( nums[i] == nums[i+1] ) {
                return true;
            }
        }
        return false;
    }

    // Set 자료구조는 Hash 값으로 조회하기 때문에
    // 시간 복잡도 O(1)으로 요소를 검색하고 포함하는지 확인할 수 있다.
    // 순회가 한번만 일어나기 때문에 시간복잡도는 줄어들지만, Set을 사용하기 때문에 공간 복잡도는 증가한다.
    // 시간 복잡도 O(N), 공간 복잡도 O(N)
    public boolean solution3(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if ( set.contains(nums[i]) ) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,2,3,4,5};
        System.out.println("Leng : "+nums.length);

        DupCheck dupCheck = new DupCheck();
        System.out.println(dupCheck.solution1(nums));
        System.out.println(dupCheck.solution2(nums));
        System.out.println(dupCheck.solution3(nums));
    }


}
