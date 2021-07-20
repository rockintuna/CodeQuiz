package baekjoon;

public class Q4673 {

    public static void main(String[] args) {

        int[] arr =  new int[10001];

        int ans = 0;
        for ( int n = 1; n < 10001; n++ ) {
            if ( ans <= 10000 ) {
                arr[ans] = ans;
            }
            ans = d(n);
        }
        for ( int i = 1; i < arr.length; i++ ) {
            if ( arr[i] == 0 ) {
                System.out.println(i);
            }
        }

    }

    public static int d(int n) {
        int num = n;
        String stringOfN = String.valueOf(n);
        int length = stringOfN.length();

        for (int i = 0; i < length; i++ ) {
            num += stringOfN.charAt(i)-'0';
        }
        return num;
    }
}
