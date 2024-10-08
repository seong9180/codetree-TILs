//package NoviceMid.Simulation2;

import java.util.Scanner;

public class Main {
    public static int n, m;
    public static final int MAX_N = 1000, MAX_M = 1000;
    public static int[] arrA = new int[1000000];
    public static int[] arrB = new int[1000000];

    //선두 변경 시 카운트 증가하는 함수
    public static int CountLeader(int totalT) {
        int t = totalT;
        int count = 0;
        int isLeader = 0; // 공동 리더 :0, a 리더 : 1, b 리더 : 2

        for (int i = 1; i < t; i++) { //원점에서는 카운트하지 않으니 time = 1 부터 선두 카운트
            if (arrA[i] > arrB[i] && isLeader != 1) { //a 가 명예의 전당에 있지 않고 선두로 올라섰을 때. (공동 명예의 전당 제외)
                isLeader = 1;
                count ++;
                //System.out.println("a 가 명예의 전당 입성 : " + i);
            } else if (arrA[i] < arrB[i] && isLeader != 2) {
                isLeader = 2;
                count ++;
                //System.out.println("b 가 명예의 전당 입성 : " + i);
            } else if (arrA[i] == arrB[i] && isLeader != 0) {
                isLeader = 0;
                count ++;
                //System.out.println("a,b 가 명예의 전당 입성 : " + i);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        int posA = 0 , posB = 0; //a,b 현재 위치를 저장하는 변수
        int aTime = 1, bTime = 1;
        int totalT = 0; // a,b 의 총 이동 시간(a,b 동일)

        //시작점 설정.
        arrA[0] = 0;
        arrB[0] = 0;

        for (int i = 0; i < n; i++) {
            int v = sc.nextInt(); //속도
            int t = sc.nextInt(); //시간

            for (int j = 1; j <= t; j++) {
                posA += v;
                arrA[aTime] = posA;
                aTime ++;
            }
        }

        for (int i = 0; i < m; i++) {
            int v = sc.nextInt(); //속도
            int t = sc.nextInt(); //시간

            for (int j = 1; j <= t; j++) {
                posB += v;
                arrB[bTime] = posB;
                bTime ++;
            }
        }

        // 시간 확인용
        if (aTime != bTime) {
            System.out.println("오류 : a,b 이동 시간의 총합이 다릅니다.");
        } else {
            int answer = CountLeader(aTime);
            System.out.println(answer);
        }


    }
}