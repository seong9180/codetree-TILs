import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();

        long left = 1;
        long right = (long) Math.sqrt(2 * s) + 1;  // 가능한 최대 n 값의 초기 추정치 설정
        long answer = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            long sum = mid * (mid + 1) / 2;

            if (sum <= s) {
                answer = mid;  // 가능한 최대의 n을 기록
                left = mid + 1; // 더 큰 n을 찾기 위해 범위 증가
            } else {
                right = mid - 1; // n을 줄여서 다시 시도
            }
        }

        System.out.println(answer);
    }
}