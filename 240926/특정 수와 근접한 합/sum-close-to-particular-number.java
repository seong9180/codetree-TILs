//package NoviceMid.ExhaustiveSearch;

import java.util.Scanner;

public class Main {
    public static int s, n;
    public static final int MAX_N = 100;
    public static int[] arr = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        s = sc.nextInt();
        int allNsum = 0; //모든 N 개의 숫자들의 합을 저장
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            allNsum += arr[i];
        }

        int minDiff = s; //최대한 s와 가까운 totalSum 과 S의 차이를 저장
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int totalSum = allNsum - arr[i] - arr[j];
                minDiff = Math.min(Math.abs(s - totalSum), minDiff);
            }
        }

        System.out.println(minDiff);
    }
}