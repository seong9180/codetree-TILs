//package study.codetree.mid.sort.instance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //블럭 범위
        int k = sc.nextInt(); //명령 갯수
        int[] block = new int[n];

        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int j = a - 1; j < b; j++) { //입력 범위 내에서
                block[j] ++; //블럭 쌓기
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (block[i] >= max) {
                max = block[i];
            }
        }

        System.out.println(max);

    }
}