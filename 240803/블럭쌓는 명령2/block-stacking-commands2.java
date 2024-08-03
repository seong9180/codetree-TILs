//package NoviceMid.Simulation1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //블록 갯수
        int k = sc.nextInt(); //명령 횟수
        int[] blocked = new int[n]; //각 칸마다 블록이 쌓일 배열

        for (int i = 0; i < k; i++) {
            //블록의 범위 지정
            int ai = sc.nextInt();
            int bi = sc.nextInt();

            for (int j = ai - 1; j < bi; j++) {
                blocked[j]++;
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max <= blocked[i]) {
                max = blocked[i];
            }
        }

        System.out.println(max);

    }
}