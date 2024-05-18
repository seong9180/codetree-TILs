//package study.codetree.samsung.exhaustive_search;

import java.util.Scanner;

public class Main {
    public static final int MAX = 200;
    public static int n, m;
    //북 동 남 서 순서
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static int[] dir = {0, 1, 2, 3, 0};
    public static int[][] grid = new int[MAX][MAX];
    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < m);
    }
    public static int blockA_MaxCount() { //ㄴ 모양 블럭
        int blockA_sum = 0, maxCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 1; k <= 4; k++) {
                    //인접한 dir 끼리 묶어서 inRange 하기 위해 nx1,nx2 / ny1,ny2 선언

                    int nx1 = i + dx[dir[k-1]];
                    int nx2 = i + dx[dir[k]];
                    int ny1 = j + dy[dir[k-1]];
                    int ny2 = j + dy[dir[k]];

                    if (inRange(nx1, ny1) && inRange(nx2, ny2)) { //인접한 두 dir 에 해당하는 값 + 중심값 = 블럭 내부 값의 합
                        blockA_sum = grid[i][j] + grid[nx1][ny1] + grid[nx2][ny2];
                        if (blockA_sum >= maxCount) {
                            maxCount = blockA_sum;
                        }
                    }
                }
            }
        }
        return maxCount;
    }
    public static int blockB_MaxCount() { //ㅡ 모양 블럭
        int blockB_sum = 0, maxCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 2; k < 4; k++) {
                    //인접한 dir 끼리 묶어서 inRange 하기 위해 nx1,nx2 / ny1,ny2 선언
                    int nx1 = i + dx[dir[k-2]];
                    int nx2 = i + dx[dir[k]];
                    int ny1 = j + dy[dir[k-2]];
                    int ny2 = j + dy[dir[k]];

                    if (inRange(nx1, ny1) && inRange(nx2, ny2)) { //인접하지 않은 두 dir 에 해당하는 값 + 중심값 = 블럭 내부 값의 합
                        blockB_sum = grid[i][j] + grid[nx1][ny1] + grid[nx2][ny2];
                        if (blockB_sum >= maxCount) {
                            maxCount = blockB_sum;
                        }
                    }
                }
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int totalMax = Math.max(blockA_MaxCount(), blockB_MaxCount());
        System.out.println(totalMax);

    }
}