//package NoviceMid.Simulation2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 1;
        int maxCnt = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || arr[i - 1] == arr[i]) {
                cnt++;
                if (cnt >= maxCnt) {
                    maxCnt = cnt;
                }
            } else {
                cnt = 1;
            }
        }

        System.out.println(maxCnt);
    }
}