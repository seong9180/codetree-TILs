//package study.codetree.low;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //행의 크기
        int n = sc.nextInt();
        int[][] grid = new int[n][n];

        for(int i = 0 ; i < n; i++){
            grid[i][0] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] = grid[i-1][j-1] + grid[i-1][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

    }
}