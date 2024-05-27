//package codetree.middle.dxdy;

import java.util.Scanner;

public class Main {
    public static int n, m;
    public static int[] dx = {1, 0, -1, 0}; //남동북서
    public static int[] dy = {0, 1, 0, -1};

    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        int[][] grid = new int[n][m];

        int x = 0, y = 0;
        int dir = 0; //초기 방향이 남쪽 > 동 > 북
        grid[0][0] = 1;

        /*
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (inRange(nx, ny) && grid[nx][ny] == 0) {
                    grid[nx][ny] = ++ count ;
                }else if(!inRange(nx, ny) || grid[nx][ny] != 0){
                    dir = (dir + 1) % 4;
                    continue;
                }

                x += dx[dir];
                y += dy[dir];
            }
        }
        */

        for (int i = 2; i <= n * m; i++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if(!inRange(nx, ny) || grid[nx][ny] != 0) {
                dir = (dir + 1) % 4;
            }

            x += dx[dir];
            y += dy[dir];

            grid[x][y] = i;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

    }
}