//package NoviceMid.Simulation2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arrA = new int[1000];
        int[] arrB = new int[1000];
        int aTime = 0;
        int bTime = 0;
        int aPos = 0;
        int bPos = 0;

        for (int i = 0; i < n; i++) {
            char dir = sc.next().charAt(0);
            int t = sc.nextInt();
            for (int j = aTime; j < aTime + t; j++) {
                if (dir == 'R') {
                    aPos += 1; //현재 a 위치 이동
                } else { // dir == 'L'
                    aPos -= 1;
                }
                arrA[j] = aPos;
                //aTime++;
            }
            aTime += t;
        }

        for (int i = 0; i < m; i++) {
            char dir = sc.next().charAt(0);
            int t = sc.nextInt();
            for (int j = bTime; j < bTime + t; j++) {
                if (dir == 'R') {
                    bPos += 1; //현재 a 위치 이동
                } else { // dir == 'L'
                    bPos -= 1;
                }
                arrB[j] = bPos;
                //bTime++;
            }
            bTime += t;
        }

        for (int i = 0; i < 1000; i++) {
            if (arrA[i] == arrB[i]) {
                System.out.println(i+1);
                break;
            }
            if (i == 999) {
                System.out.println(-1);
            }
        }
    }
}