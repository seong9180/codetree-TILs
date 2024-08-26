//package NoviceMid.Simulation2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arrA = new int[1000];
        int[] arrB = new int[1000];
        arrA[0] = 0;
        arrB[0] = 0;
        int aTime = 1;
        int bTime = 1;
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

        int maxTime = Math.max(aTime, bTime);
        boolean exist = false;

        for (int i = 1; i < maxTime; i++) {
            if (arrA[i] == arrB[i]) {
                System.out.println(i);
                exist = true;
                break;
            }
        }
        if (!exist) {
            System.out.println(-1);
        }
    }
}