import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] checkpoints = new int[N][2];

        // 체크포인트 좌표 입력
        for (int i = 0; i < N; i++) {
            checkpoints[i][0] = scanner.nextInt();
            checkpoints[i][1] = scanner.nextInt();
        }

        int totalDistance = 0;
        for (int i = 1; i < N; i++) {
            totalDistance += manhattanDistance(checkpoints[i-1], checkpoints[i]);
        }

        int minDistance = totalDistance;

        // 각 체크포인트를 건너뛰었을 때의 거리 계산
        for (int i = 1; i < N - 1; i++) {
            int newDistance = totalDistance - manhattanDistance(checkpoints[i-1], checkpoints[i])
                              - manhattanDistance(checkpoints[i], checkpoints[i+1])
                              + manhattanDistance(checkpoints[i-1], checkpoints[i+1]);
            minDistance = Math.min(minDistance, newDistance);
        }

        System.out.println(minDistance);
    }

    // 맨해튼 거리 계산 함수
    private static int manhattanDistance(int[] point1, int[] point2) {
        return Math.abs(point1[0] - point2[0]) + Math.abs(point1[1] - point2[1]);
    }
}