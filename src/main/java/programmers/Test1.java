package programmers;

public class Test1 {
    public long solution(long n) {
        long answer = 0;
        long num = 1;

        while ( num/n < n ) {
            if ( num/n == num%n ) {
                answer += num;
            }
            num += 1;
        }
        return answer;
    }
}
