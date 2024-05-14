//package study.codetree.samsung.exhaustive_search;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = System.currentTimeMillis();
        int n = sc.nextInt();
        int[][] grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        int x = 0;
        int y = 0;
        //초기 (x,y) 시작점 선언
        int max = 0;

        // 3*3 의 좌측 상단 좌표를 기준으로 삼기.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;
                if (i + 2 >= n || j + 2 >= n) {
                    continue;
                }else{
                    for (int k = i; k <= i + 2; k++) {
                        for (int d = j; d <= j + 2; d++) {
                            if (grid[k][d] == 1) {
                                count ++;
                            }
                        }
                    }
                    if (count >= max) {
                        max = count;
                    }
                }
            }
        }

        System.out.println(max);
        long end = System.currentTimeMillis();
        //System.out.println("수행시간: " + (end - start) + " ms");


    }
}