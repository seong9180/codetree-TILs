//package study.codetree.mid.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int n;
    public static int MAX_N = 1000;
    public static int[] arr = new int[2 * MAX_N];

    public static int groupSumMin(int[] arr, int x) {
        int sumMax = 0;
        for (int i = 1; i <= 2 * x; i++) {
            if(arr[2 * x - i] + arr[i - 1] >= sumMax){
                sumMax = arr[2 * x - i] + arr[i - 1];
            }
        }
        return sumMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for (int i = 0; i < 2 * n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, 0, 2 * n);
        int answer = groupSumMin(arr, n);
        System.out.println(answer);
    }
}