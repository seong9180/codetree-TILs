//package NoviceMid.ExhaustiveSearch;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static int n;
    public static final int MAX_N = 100;
    public static int[] arr = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int totalMax = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 2; j < n; j++) {
                totalMax = Math.max(arr[i] + arr[j], totalMax);
            }
        }

        System.out.println(totalMax);
    }
}