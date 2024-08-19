//package NoviceMid.Simulation1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // square count
        int[][] xySquare = new int[200][200];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + 100;
            int y1 = sc.nextInt() + 100;
            int x2 = sc.nextInt() + 100;
            int y2 = sc.nextInt() + 100;
            //OFFSET = 100

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    xySquare[j][k] = 1;
                }
            }
        }

        int count = 0;

        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 200; j++) {
                if (xySquare[i][j] == 1) {
                    count ++;
                }
            }
        }

        System.out.println(count);
    }
}