import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int n = scanner.nextInt();
        int[][] grid = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        // 인접한 칸의 숫자 1의 개수를 세는 함수
        int count = 0;
        int[] dx = {-1, 1, 0, 0}; // 상하좌우 이동을 위한 배열
        int[] dy = {0, 0, -1, 1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int adjacentOnes = 0;
                for (int k = 0; k < 4; k++) {
                    int ni = i + dx[k];
                    int nj = j + dy[k];
                    if (ni >= 0 && ni < n && nj >= 0 && nj < n && grid[ni][nj] == 1) {
                        adjacentOnes++;
                    }
                }
                if (adjacentOnes >= 3) {
                    count++;
                }
            }
        }

        // 결과 출력
        System.out.println(count);
    }
}