//package study.codetree.samsung.exhaustive_search;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static int MAX_N = 100;
    public static int n;
    public static int m;
    public static int[][] grid = new int[MAX_N][MAX_N];
    public static int isHappySequence(int n, int m){
        int happyCount = 0;

        for (int i = 0; i < n; i++) { //가로 행
            for (int j = 0; j < n - 1; j++) { // j + 1 이 n - 1 범위를 넘어가면 안 됨.
                int sequenceCount = 1;
                int maxCount = 0;
                if (grid[i][j] == grid[i][j + 1] && sequenceCount >= maxCount) {
                    sequenceCount += 1;
                    maxCount = sequenceCount;
                }else if(grid[i][j] != grid[i][j + 1]){
                    sequenceCount -= 1;
                    if (m == 1) {
                        happyCount ++;
                        break;
                    }
                }
                if (m != 1 && maxCount >= m) {
                    happyCount ++;
                }
            }
        }

        for (int i = 0; i < n; i++) { //세로 행 : i , j 반전
            for (int j = 0; j < n - 1; j++) { // j + 1 이 n - 1 범위를 넘어가면 안 됨.
                int sequenceCount = 1;
                int maxCount = 0;
                if (grid[j][i] == grid[j][i + 1] && sequenceCount >= maxCount) {
                    sequenceCount += 1;
                    maxCount = sequenceCount;
                }else if(grid[j][i] != grid[j][i + 1]){
                    sequenceCount -= 1;
                    if (m == 1) {
                        happyCount ++;
                        break;
                    }
                }
                if (m != 1 && maxCount >= m) {
                    happyCount ++;
                }
            }
        }

        return happyCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = System.currentTimeMillis();

        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        System.out.println(isHappySequence(n, m));
        long end = System.currentTimeMillis();
        //System.out.println("수행시간: " + (end - start) + " ms");

    }
}