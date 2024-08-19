//package NoviceMid.Simulation1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 색종이 갯수
        int[][] area = new int[200][200];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + 100;
            int y1 = sc.nextInt() + 100;
            int x2 = x1 + 8;
            int y2 = y1 + 8;
            //offset == 100, x2,y2 는 원점에서 +8씩 늘어난 좌표

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    area[j][k] = 1; //겹치는 부분은 한번만 계산되니, 모두 동일하게 1의 값을 가지게 함
                }
            }
        }

        int count = 0;
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 200; j++) {
                if (area[i][j] == 1) {
                    count ++;
                }
            }
        }

        System.out.println(count);
        
    }
}