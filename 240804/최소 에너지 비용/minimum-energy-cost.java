import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 장소의 개수 입력
        int n = scanner.nextInt();
        
        // 장소 간 이동 에너지 입력
        long[] moveEnergy = new long[n - 1];
        for (int i = 0; i < n - 1; i++) {
            moveEnergy[i] = scanner.nextLong();
        }
        
        // 각 장소의 에너지 충전 비용 입력
        long[] chargeCost = new long[n];
        for (int i = 0; i < n; i++) {
            chargeCost[i] = scanner.nextLong();
        }
        
        // 동적 프로그래밍을 위한 배열
        long[] dp = new long[n];
        dp[0] = 0; // 시작 지점의 비용은 0
        
        // 최소 비용 계산
        for (int i = 1; i < n; i++) {
            dp[i] = Long.MAX_VALUE;
            long energy = 0;
            for (int j = i - 1; j >= 0; j--) {
                energy += moveEnergy[j];
                dp[i] = Math.min(dp[i], dp[j] + energy * chargeCost[j]);
            }
        }
        
        // 결과 출력
        System.out.println(dp[n - 1]);
        
        scanner.close();
    }
}