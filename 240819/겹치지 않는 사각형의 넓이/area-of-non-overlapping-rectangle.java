//package NoviceMid.Simulation1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] xySquare = new int[2000][2000];

        for (int i = 0; i < 3; i++) {
            int x1 = sc.nextInt() + 1000;
            int y1 = sc.nextInt() + 1000;
            int x2 = sc.nextInt() + 1000;
            int y2 = sc.nextInt() + 1000;
            //OFFSET = 1000

            if (i == 2) { //사각형 M
                for (int j = x1; j < x2; j++) {
                    for (int k = y1; k < y2; k++) {
                        xySquare[j][k]+=2; //M 과 겹치게 되면 3 값을 가지게 됨.
                    }
                }
            } else {
                for (int j = x1; j < x2; j++) {
                    for (int k = y1; k < y2; k++) {
                        xySquare[j][k] = 1;
                    }
                }
            }
        }

        int count = 0;

        for (int i = 0; i < 2000; i++) {
            for (int j = 0; j < 2000; j++) {
                if (xySquare[i][j] == 1) {
                    count ++;
                }
            }
        }

        System.out.println(count);
    }
}