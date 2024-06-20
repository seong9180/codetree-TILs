import java.util.Scanner;

public class Main {
    static int n;
    static int[][] grid;
    static boolean[] visited;
    static int maxSum;

    // 백트래킹을 이용하여 최대 합을 구하는 함수
    public static void backtrack(int row, int currentSum) {
        // 모든 행에 대해 색칠이 완료되었을 때 최대 합 갱신
        if (row == n) {
            maxSum = Math.max(maxSum, currentSum);
            return;
        }

        // 각 행의 모든 열을 탐색
        for (int col = 0; col < n; col++) {
            if (!visited[col]) {
                visited[col] = true;
                backtrack(row + 1, currentSum + grid[row][col]);
                visited[col] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 줄에서 n을 입력받습니다.
        n = scanner.nextInt();
        grid = new int[n][n];
        visited = new boolean[n];

        // 두 번째 줄부터 n개의 줄에 걸쳐 n개의 정수를 입력받습니다.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        // 최대 합 초기화
        maxSum = 0;

        // 백트래킹 시작
        backtrack(0, 0);

        // 결과 출력
        System.out.println(maxSum);
        
        scanner.close();
    }
}