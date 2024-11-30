//package IntermediateLow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] block1 = new int[n];
        int[] block2 = new int[n];

        for (int i = 0; i < n; i++) {
            block1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            block2[i] = sc.nextInt();
        }

        for (int i = 0; i < t; i++) {
            int temp1 = block1[n-1];
            int temp2 = block2[n-1];

            for (int j = n - 1; j > 0; j--) {
                block1[j] = block1[j-1];
            }
            block1[0] = temp2;

            for (int j = n - 1; j > 0; j--) {
                block2[j] = block2[j-1];
            }
            block2[0] = temp1;

        }

        //출력
        for (int i = 0; i < n; i++) {
            System.out.print(block1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(block2[i] + " ");
        }
    }
}
