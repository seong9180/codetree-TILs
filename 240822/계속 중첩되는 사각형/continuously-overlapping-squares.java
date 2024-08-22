//package NoviceMid.Simulation1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //i 가 홀수/짝수로 빨간색/파란색 직사각형을 정의.

        int[][] arr = new int[200][200];

        //OFFSET = 100
        for (int i = 1; i <= n; i++) {
            int x1 = sc.nextInt() + 100;
            int y1 = sc.nextInt() + 100;
            int x2 = sc.nextInt() + 100;
            int y2 = sc.nextInt() + 100;

            if (i % 2 == 0) {//i == 짝수 (i는 1부터 시작. 짝수 > 파란색)
                for (int j = x1; j < x2; j++) {
                    for (int k = y1; k < y2; k++) {
                        arr[j][k] = 2; //파란색 : 2 빨간색 : 1
                    }
                }
            } else { //i == 홀수 (빨간색)
                for (int j = x1; j < x2; j++) {
                    for (int k = y1; k < y2; k++) {
                        arr[j][k] = 1; //파란색 : 2 빨간색 : 1
                    }
                }
            }
        }

        int area = 0;
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 200; j++) {
                if (arr[i][j] == 2) { //최종 색상이 파란색이라면
                    area++;
                }
            }
        }

        System.out.println(area);
    }
}