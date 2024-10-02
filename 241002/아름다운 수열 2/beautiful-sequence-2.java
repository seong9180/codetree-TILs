//package NoviceMid.ExhaustiveSearch;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int n, m;
    public static final int MAX_N = 100;
    public static final int MAX_M = 100;
    public static int[] arrA = new int[MAX_N];
    public static int[] arrB = new int[MAX_M];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arrA[i]= sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            arrB[i] = sc.nextInt();
        }

        int[] freqB = new int[101];

        for (int i = 0; i < m; i++) {
            freqB[arrB[i]]++;
        }

        int answer = 0;

        for (int i = 0; i <= n - m; i++) {
            int[] freqA = new int[101];
            for (int j = i; j < i + m; j++) {
                freqA[arrA[j]]++;
            }
            if (Arrays.equals(freqA, freqB)) {
                answer++;
            }
        }
        System.out.println(answer);

    }
}