import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 장소의 개수를 입력받습니다.
        int n = scanner.nextInt();

        // 장소와 장소를 이동할 때 드는 에너지를 입력받습니다.
        int[] travelCosts = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            travelCosts[i] = scanner.nextInt();
        }

        // 각 장소마다 에너지 1을 채우는데 드는 비용을 입력받습니다.
        int[] fillCosts = new int[n];
        for (int i = 0; i < n; i++) {
            fillCosts[i] = scanner.nextInt();
        }

        // 최소 비용을 계산합니다.
        long totalCost = 0;
        int minCost = fillCosts[0]; // 첫 번째 장소의 에너지 충전 비용

        for (int i = 0; i < n - 1; i++) {
            if (fillCosts[i] < minCost) {
                minCost = fillCosts[i]; // 현재 장소에서의 충전 비용이 더 싸다면 갱신
            }
            totalCost += (long) minCost * travelCosts[i];
        }

        // 최종 비용을 출력합니다.
        System.out.println(totalCost);

        scanner.close();
    }
}