//package study.codetree.mid.recursive;
import java.util.Scanner;

public class Main {
    public static int countingMax(int[] arr, int n) {
        int max = 0;
        if (n == 1) {
            return arr[0];
        }
        return Math.max(arr[n - 1], countingMax(arr, n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(countingMax(arr, n));

    }
}