//package study.codetree.mid.simulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //선분 갯수
        int[] area = new int[100];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            for(int j = x1 -1; j < x2; j++){ // 끝과 끝에서 만나도 겹치는 판정
                area[j]++;
            }
        }

        int max = 0;
        for (int i = 0; i < area.length; i++) {
            if (area[i] >= max) {
                max = area[i];
            }
        }

        System.out.println(max);
    }
}