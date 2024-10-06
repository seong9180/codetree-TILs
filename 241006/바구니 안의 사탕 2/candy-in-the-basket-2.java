//package NoviceMid.ExhaustiveSearch;

import java.util.Scanner;

public class Main {
    public static int n,k;
    public static final int MAX_N = 100;
    public static int[] basket = new int[101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        int[] candy = new int[101];

        for (int i = 0; i < n; i++) {
            int candys = sc.nextInt();
            int pos = sc.nextInt();

            candy[pos + 1] += candys;
        }

        int answer = 0;
        for (int i = 0; i < candy.length; i++) {
            //중심점이 i 인 경우를 완전탐색
            int candySum = 0;
            if (i - k >= 0 && i + k <= 100) {
                for (int j = i - k; j <= i + k; j++) {
                    candySum += candy[j];
                }
            } else if(i - k < 0 && i + k <= 100) {
                for (int j = 0; j <= i + k; j++) {
                    candySum += candy[j];
                }
            } else if (i - k >= 0 && i + k > 100) {
                for (int j = i - k; j <= 100; j++) {
                    candySum += candy[j];
                }
            } else {
                for (int j = 0; j <= 100; j++) {
                    candySum += candy[j];
                }
            }

            answer = Math.max(candySum, answer);
        }

        System.out.println(answer);

    }
}