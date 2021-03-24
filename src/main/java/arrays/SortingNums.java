package arrays;

import java.util.Arrays;

//1부터 100 까지의 숫자 중에 50개의 랜덤한 숫자가 들어있는 배열이 있다. 이 배열을 O(n)의 시간 복잡도로 정렬하라.
public class SortingNums {

    //Arrays.sort는 시간복잡도 O(NlogN)이므로 사용할 수 없다.
    //주어지는 배열의 크기(50)나 범위가 제한되어 있으므로 또 다른 배열을 사용하여 해결할 수 있다.
    public int[] solution1(int[] nums) {
        int[] sortingArr = new int[100];
        for (int i = 0; i < nums.length; i++) {
            sortingArr[nums[i]] = nums[i];
        }

        int index = 0;
        for (int i = 0; i < sortingArr.length; i++) {
            if ( sortingArr[i] != 0 ) {
                nums[index] = sortingArr[i];
                index++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        SortingNums sortingNums = new SortingNums();
        int[] nums = new int[50];
        for (int i = 49; i > 0; i--) {
            nums[i] = i+1;
        }
        System.out.println(Arrays.toString(sortingNums.solution1(nums)));
    }

}
