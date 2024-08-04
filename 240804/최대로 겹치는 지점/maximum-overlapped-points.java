//package NoviceMid.Simulation1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //겹치는 '점' x1 ~ x2
        //몇 개의 선분이 겹치는지 == visited 배열 최대값

        int[] visited = new int[101];
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            for (int j = x1; j <= x2; j++) {
                visited[j]++;
            }
        }

        int max = 0;
        for (int i = 0; i < 101; i++) {
            if (max <= visited[i]) {
                max = visited[i];
            }
        }

        System.out.println(max);

    }
}