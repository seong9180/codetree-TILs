//package NoviceMid.Simulation2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        1초에 한 칸. (좌우로만 이동 +1 or -1)
//        a가 움직이는 횟수 = n
//        b가 움직이는 횟수 = m
//
//        a,b 가 "바로 직전에는 다른 위치에 있다가", 그 다음번에 같은 위치에 오게 되는 경우.
//        count ++;
//
//        단, 처음시작할 때 같은 위치에 있던 것은 count x
//
//        로봇이 움직임을 종료한 경우 같은 위치에 머물러 있음.
//        a 가 멈춰있고 b 가 a 자리로 오는 경우에도 count ++;
//        단, 모든 로봇이 움직인 이후의 상황은 x

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arrA = new int[1000001];
        int[] arrB = new int[1000001];
        arrA[0] = 0;
        arrB[0] = 0;
        int aPos = 0, bPos = 0;
        int aTime = 1, bTime = 1;

        for (int i = 0; i < n; i++) {
            int time = sc.nextInt();
            char dir = sc.next().charAt(0);

            for (int j = aTime; j < aTime + time; j++) {
                if (dir == 'L') {
                    aPos -= 1;
                } else {
                    aPos += 1;
                }
                arrA[j] = aPos;
            }
            aTime += time;
        }

        for (int i = 0; i < m; i++) {
            int time = sc.nextInt();
            char dir = sc.next().charAt(0);

            for (int j = bTime; j < bTime + time; j++) {
                if (dir == 'L') {
                    bPos -= 1;
                } else {
                    bPos += 1;
                }
                arrB[j] = bPos;
            }
            bTime += time;
        }

        int count = 0;
        int bigTime = Math.max(aTime, bTime);
        //a 로봇과 b 로봇의 가동시간 비교 후, 가동시간이 짧은 로봇의 마지막 위치를 다른 로봇의 가동시간까지 유지해서 저장하기
        if (bigTime == aTime) {
            for (int i = bTime; i <= bigTime; i++) {
                arrB[i] = arrB[bTime-1];
            }
        } else {
            for (int i = aTime; i <= bigTime; i++) {
                arrA[i] = arrA[aTime-1];
            }
        }

        for (int i = 1; i < bigTime; i++) {
            if (arrA[i - 1] != arrB[i - 1] && arrA[i] == arrB[i]) {
                count ++;
            }
        }
        System.out.println(count);
    }
}