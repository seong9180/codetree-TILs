//package study.codetree.mid.function;

import java.util.Scanner;

public class Main {
    public static int n, m;
    public static final int MAX_N = 100;
    public static int[] arr = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int sum = 0;
            for (int j = a1 - 1; j < a2; j++) {
                sum += arr[j];
            }
            System.out.println(sum);
        }
    }
}