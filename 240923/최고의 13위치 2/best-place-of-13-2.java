import java.util.Scanner;

public class Main {
    static int N;
    static int[][] grid;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        grid = new int[N][N];

        // 격자 정보 입력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int maxCoins = findMaxCoins();
        System.out.println(maxCoins);

        sc.close();
    }

    static int findMaxCoins() {
        int maxCoins = 0;

        // 모든 가능한 첫 번째 1x3 격자 위치에 대해
        for (int r1 = 0; r1 < N; r1++) {
            for (int c1 = 0; c1 <= N - 3; c1++) {
                // 모든 가능한 두 번째 1x3 격자 위치에 대해
                for (int r2 = 0; r2 < N; r2++) {
                    for (int c2 = 0; c2 <= N - 3; c2++) {
                        // 두 격자가 겹치지 않는 경우에만 검사
                        if (r1 != r2 || Math.abs(c1 - c2) >= 3) {
                            int coins = countCoins(r1, c1) + countCoins(r2, c2);
                            maxCoins = Math.max(maxCoins, coins);
                        }
                    }
                }
            }
        }

        return maxCoins;
    }

    static int countCoins(int row, int col) {
        int coins = 0;
        for (int i = 0; i < 3; i++) {
            coins += grid[row][col + i];
        }
        return coins;
    }
}