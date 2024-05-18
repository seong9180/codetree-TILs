//package study.codetree.samsung.exhaustive_search;

import java.util.Scanner;
public class Main {
    public static int n, m;
    public static final int MAX_N = 100;
    public static int[][] grid = new int[MAX_N][MAX_N];
    public static int[] seq = new int[MAX_N];

    public static boolean isHappySequence() {
        int maxcCount = 1, consecutiveCount = 1;
        for (int i = 1; i < n; i++) {
            if (seq[i-1] == seq[i]) {
                consecutiveCount ++;
            }else{
                consecutiveCount = 1; //연속하지 않으면 - 가 아니고 1(초기상태) 로 돌아오게 하기
            }

            maxcCount = Math.max(consecutiveCount, maxcCount); //최대값 편하게 사용법
        }
        return (maxcCount >= m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        int numHappy = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt(); //주의해야 할 부분 !
            }
        }

        //가로열 카운트
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                seq[j] = grid[i][j];
            }
            if (isHappySequence()) {
                numHappy ++;
            }
        }

        //세로열 카운트
        for(int j = 0; j < n; j++){
            // 세로로 숫자들을 모아 새로운 수열을 만듭니다.
            for(int i = 0; i < n; i++)
                seq[i] = grid[i][j];

            if(isHappySequence())
                numHappy++;
        }

        System.out.println(numHappy);
    }
}