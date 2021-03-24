package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //단순 순회
    //시간복잡도 O(N^2), 공간복잡도 O(1)
    public int[] solution1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if ( nums[i] + nums[j] == target ) {
                    return new int[]{i,j};
                }
            }
        }
        throw new RuntimeException();
    }

    //순회에서 어떤 요소에 대해 찾아야 하는 값은 (target-요소)로 정해져 있다.
    //Map<val, index>을 이용하여 시간복잡도를 줄일 수 있다.
    //Map의 get, containsKey 메소드의 시간복잡도는 O(1)
    //시간복잡도 O(N), 공간복잡도 O(N)
    public int[] solution2(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if ( map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i ) {
                return new int[] {i, map.get(target - nums[i])};
            }
        }
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        TwoSum sumLocation = new TwoSum();
        System.out.println(Arrays.toString(sumLocation.solution1(new int[]{2,3,5,7}, 8)));
        System.out.println(Arrays.toString(sumLocation.solution2(new int[]{2,3,5,7}, 8)));
    }
}
