package baekjoon;

import java.util.Scanner;

public class Q10809 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int[] nums = new int[str.length()];
        for ( int i = 0; i < nums.length; i++ ) {
            nums[i] = str.charAt(i);
        }

        for ( int i = 97; i <= 122; i++ ) {
            for (int j = 0; j < nums.length; j++) {
                if ( i == nums[j] ) {
                    System.out.print(j);
                    break;
                } else if ( j == nums.length-1 ) {
                    System.out.print(-1);
                }
            }
            System.out.print(' ');
        }

    }
}
