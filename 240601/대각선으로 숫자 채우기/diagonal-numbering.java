//package study.codetree.low;

import java.util.Scanner;

public class Main {
    public static int n, m;
    public static final int MAX_N = 100, MAX_M = 100;
    public static int[][] grid = new int[MAX_N][MAX_M];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        /*
        토론에서 얻은 아이디어 ! = 매 대각선마다 i+j 합이 일정
        [4 * 5 형태일 때 index]
        00  01  02  03  04  05
        10  11  12  13  14  15
        20  21  22  23  24  25
        30  31  32  33  34  35

        각 대각선 마다, i + j 의 값이 일정함.
        0 > 1 > 2 > 3 > 4 > 5 > 6 > 7 > 8
         */
        int count = 1;
        int ijSum = 0; //각 대각선마다 합을 비교할 변수
        while(count <= n * m){ // n * m 번 채우고 나서 종료.
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (i + j == ijSum) {
                        grid[i][j] = count;
                        count ++;
                    }
                }
            }
            ijSum ++; // ijSum 값을 n*m 포문 전체에서 검사하고 다 돌면 ijSum ++
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

    }
}