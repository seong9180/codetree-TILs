//package IntermediateLow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int maxCount = 0;
        //3 * 3 크기의 격자 -> 루프 범위 n - 3 까지만
        for (int i = 0; i <= n - 3; i++) {
            for (int j = 0; j <= n - 3; j++) {
                //3*3 격자의 좌측 상단 시작점을 기준으로
                int count = 0;
                for (int d = i; d < i + 3; d++) {
                    for (int k = j; k < j + 3; k++) {
                        if (arr[d][k] == 1) {
                            count++;
                        }
                    }
                }
                maxCount = Math.max(maxCount, count);
            }
        }

        System.out.println(maxCount);
    }
}
