package stack;

import java.util.Arrays;
import java.util.Stack;

public class Span {

    //스팬 찾기 - 이중 순회
    //시간복잡도 O(N^2), 공간복잡도 O(N)
    public int[] getSpan1(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count=0;
            for (int j = 0; j <= i; j++) {
                if ( nums[i] >= nums[j] ) {
                    count++;
                } else {
                    count = 0;
                }
            }
            result[i] = count;
        }
        return result;
    }

    //스팬 찾기 - 스택
    //인덱스에서 최고점 인덱스 빼기
    //시간복잡도 O(N), 공간복잡도 O(N)
    public int[] getSpan2(int[] nums) {
        int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        result[0] = 1;
        stack.push(0);

        for (int i = 1; i < nums.length; i++) {
            while ( !stack.isEmpty() && nums[i] >= nums[stack.peek()] ) {
                stack.pop();
            }

            if ( stack.isEmpty() ) {
                result[i] = i+1;
            } else {
                result[i] = i - stack.peek();
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {5,3,2,4,7,1};
        int[] nums2 = new int[] {2,3,4,5,6,7};
        int[] nums3 = new int[] {4,6,5,3,8,5,5,7};
        int[] nums4 = new int[] {7,3,4,8,4,7};

        Span span = new Span();
        System.out.println(Arrays.toString(span.getSpan1(nums1)));
        System.out.println(Arrays.toString(span.getSpan1(nums2)));
        System.out.println(Arrays.toString(span.getSpan1(nums3)));
        System.out.println(Arrays.toString(span.getSpan1(nums4)));

        System.out.println(Arrays.toString(span.getSpan2(nums1)));
        System.out.println(Arrays.toString(span.getSpan2(nums2)));
        System.out.println(Arrays.toString(span.getSpan2(nums3)));
        System.out.println(Arrays.toString(span.getSpan2(nums4)));
    }
}
