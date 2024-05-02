//package codetree;

import java.util.Scanner;

public class Main {
    static int[] dx = {-1,0,1,0}; //북동남서
    static int[] dy = {0,1,0,-1};
    static boolean answer = false;

    static boolean inRange(int x, int y, int n) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] grid = new int[n][n];

        for (int i = 0; i < m; i++) {
            int count = 0;
            int r = sc.nextInt();
            int c = sc.nextInt();
            //System.out.println("r = " + r);
            //System.out.println("c = " + c);

            //배열 인덱스에맞게 시작 좌표를 (0,0)으로 조정
            int x = r - 1;
            int y = c - 1;

            if (inRange(x, y, n)) {
                grid[x][y] = 1;
            }
            for (int j = 0; j < 4; j++) {

                int nx = x + dx[j];
                int ny = y + dy[j];

                if (inRange(nx, ny, n) && grid[nx][ny] != 0) {
                    count ++;
                }
            }

            //System.out.print("count = " + count + " ");
            if (count >= 3) {
                System.out.println(1);
            }else{
                System.out.println(0);
            }

        }
    }
}