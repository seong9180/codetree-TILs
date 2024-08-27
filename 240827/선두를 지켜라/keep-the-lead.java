//package NoviceMid.Simulation2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arrA = new int[1000000]; //n(or m) * v * t = 10^9
        int[] arrB = new int[1000000];
        int aPos = 0, bPos = 0;
        int aTime = 1, bTime = 1;
        //start line same (0,0)
        arrA[0] = 0;
        arrB[0] = 0;
        int totalTime = 0;

        for (int i = 0; i < n; i++) {
            int velocity = sc.nextInt(); //속력
            int movingTime = sc.nextInt(); //이동거리
            for (int j = aTime; j < aTime + movingTime; j++) {
                aPos = velocity * j;
                arrA[j] = aPos;
            }
            totalTime += movingTime;
        }

        for (int i = 0; i < m; i++) {
            int velocity = sc.nextInt(); //속력
            int movingTime = sc.nextInt(); //이동거리
            for (int j = bTime; j < bTime + movingTime; j++) {
                bPos = velocity * j;
                arrB[j] = bPos;
            }
        }

        int count = 0; //선두 변경 횟수 카운트
        boolean check = true; //true : A 선두, false : B 선두
        boolean exist = false;
        for (int i = 0; i < totalTime; i++) {
            if (arrB[i] > arrA[i] && check) {
                exist = true;
                check = false;
                count ++;
            } else if (arrA[i] > arrB[i] && !check) {
                exist = true;
                check = true;
                count ++;
            }
        }
        if (!exist) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }
}