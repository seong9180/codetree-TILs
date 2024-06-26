//package study.codetree.mid.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int n;
    public static int MAX_N = 100;
    public static int[] arrA = new int[MAX_N];
    public static int[] arrB = new int[MAX_N];

    public static boolean isSameSequence() {
        for (int i = 0; i < n; i++) {
            if (arrA[i] == arrB[i]) {
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }
        Arrays.sort(arrA, 0, n);
        for (int i = 0; i < n; i++) {
            arrB[i] = sc.nextInt();
        }
        Arrays.sort(arrB, 0, n);

        if (isSameSequence()) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}