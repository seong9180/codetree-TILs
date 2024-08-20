import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long m = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        // 최소와 최대 시도 횟수를 계산할 변수 초기화
        int minAttempts = Integer.MAX_VALUE;
        int maxAttempts = Integer.MIN_VALUE;

        // a에서 b까지 모든 숫자에 대해 시도 횟수를 계산
        for (long i = a; i <= b; i++) {
            int attempts = getAttempts(i, m);
            minAttempts = Math.min(minAttempts, attempts);
            maxAttempts = Math.max(maxAttempts, attempts);
        }

        System.out.println(minAttempts + " " + maxAttempts);
    }

    // 특정 숫자를 찾기 위한 시도 횟수를 계산하는 함수
    public static int getAttempts(long x, long m) {
        long L = 1;
        long R = m;
        int attempts = 0;

        while (L <= R) {
            attempts++;
            long mid = (L + R) / 2;

            if (mid == x) {
                break;
            } else if (mid < x) {
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }

        return attempts;
    }
}