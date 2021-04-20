import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int solution(int[] scoville, int K) {
        Arrays.sort(scoville);
        long mix;
        int count = 0;

        mix = scoville[0];

        for (int i = 1; i < scoville.length; i++ ) {
            if ( mix >= K && scoville[i] >= K ) {
                return count;
            }
            if ( mix < scoville[i] ) {
                mix = mix + scoville[i]* 2L;
            } else {
                mix = scoville[i] + mix*2;
            }
            count++;
        }
        if ( mix >= K ) {
            return count;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] scoville = {1,1,1,1,0,1000};
        Arrays.sort(scoville);
        System.out.println(scoville[0]);
        int k = 1000000000;
        long n = 999999999;
        System.out.println((k<<1)+n);
        long m = ((k<<1)+n);
        System.out.println(m);
        //System.out.println((K*2+999999999L));
        //System.out.println(solution.solution(scoville, K));
    }
}