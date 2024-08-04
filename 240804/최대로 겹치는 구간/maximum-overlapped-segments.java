//package NoviceMid.Simulation1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] visited = new int[200];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            //offset 설정
            x1 += 100;
            x2 += 100;

            for (int j = x1; j < x2; j++) { //x1 ~ x2-1 까지
                visited[j] ++;
            }
        }

        int max = 0;
        for (int i = 0; i < 200; i++) {
            if (visited[i] >= max) {
                max = visited[i];
            }
        }

        System.out.println(max);
    }
}