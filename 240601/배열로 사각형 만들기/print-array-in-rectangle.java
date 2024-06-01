//package study.codetree.low;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //크기는 5*5
        int[][] grid = new int[5][5];

        //첫 번째 행과 첫 번째 열은 모두 1로 초기화 합니다.
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || j == 0) {
                    grid[i][j] = 1;
                }else{
                    grid[i][j] = grid[i-1][j] + grid[i][j-1]; //바로 위의 값 + 바로 왼쪽의 값
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

    }
}