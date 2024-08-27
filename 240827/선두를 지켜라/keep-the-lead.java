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
                aPos += velocity;
                arrA[j] = aPos;
            }
            totalTime += movingTime;
            aTime += movingTime;
        }

        for (int i = 0; i < m; i++) {
            int velocity = sc.nextInt(); //속력
            int movingTime = sc.nextInt(); //이동거리
            for (int j = bTime; j < bTime + movingTime; j++) {
                bPos += velocity;
                arrB[j] = bPos;
            }
            bTime += movingTime;
        }

        int count = 0; //선두 변경 횟수 카운트
        //boolean check = true; //true : A 선두, false : B 선두
        int check = 0; //공동 선두, 1 : a 선두, 2 : b 선두
        boolean exist = false;
        for (int i = 0; i < totalTime; i++) {
            if (arrA[i] == arrB[i]) {
                check = 0;
            }
            else if (arrB[i] > arrA[i] && check != 2) {
                exist = true;
                check = 2;
                count ++;
            } else if (arrA[i] > arrB[i] && check != 1) {
                exist = true;
                check = 1;
                count ++;
            }
        }
        if (!exist) {
            System.out.println(-1);
        } else {
            System.out.println(count - 1);
//            if (arrA[1] != arrB[1]) { //시작 선두가 정해져 있었다면
//                System.out.println(count - 1);
//            } else {
//                System.out.println(count);
//            }
        }
    }
}