//package study.codetree.low;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //격자 크기
        int n = sc.nextInt();
        //동전 갯수
        int m = sc.nextInt();
        int[][] grid = new int[n][n];

        for (int i = 0; i < m; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            //r 행 c 열에 코인이 있음 = 배열의 인덱스로 변환하면 -1 해줘야 함
            grid[r-1][c-1] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

    }
}