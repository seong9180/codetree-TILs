import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        long m = scanner.nextLong();
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        
        // 최소 횟수와 최대 횟수 계산
        int minTurns = calculateMinTurns(1, m, a, b);
        int maxTurns = calculateMaxTurns(1, m, a, b);
        
        // 결과 출력
        System.out.println(minTurns + " " + maxTurns);
        
        scanner.close();
    }
    
    // 최소 턴 수 계산
    private static int calculateMinTurns(long left, long right, long a, long b) {
        if (left > right) return 0;
        
        long mid = (left + right) / 2;
        
        if (mid >= a && mid <= b) {
            return 1;
        } else if (mid < a) {
            return 1 + calculateMinTurns(mid + 1, right, a, b);
        } else {
            return 1 + calculateMinTurns(left, mid - 1, a, b);
        }
    }
    
    // 최대 턴 수 계산
    private static int calculateMaxTurns(long left, long right, long a, long b) {
        if (left > right) return 0;
        if (right < a || left > b) return 0;
        
        long mid = (left + right) / 2;
        
        if (mid >= a && mid <= b) {
            return 1 + Math.max(calculateMaxTurns(left, mid - 1, a, b),
                                calculateMaxTurns(mid + 1, right, a, b));
        } else if (mid < a) {
            return 1 + calculateMaxTurns(mid + 1, right, a, b);
        } else {
            return 1 + calculateMaxTurns(left, mid - 1, a, b);
        }
    }
}