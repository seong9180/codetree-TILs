//package NoviceMid.ExhaustiveSearch;

import java.util.Scanner;

public class Main {
    public static int n,k;
    public static final int MAX_N = 100;
    public static final int MAX_P = 10000;
    public static char[] arr = new char[MAX_P];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            char alphabet = sc.next().charAt(0);

            arr[number - 1] = alphabet; // 1 <= n <= 100
        }

        int totalMax = 0;

        for (int i = 0; i < MAX_P - k ; i++) {
            int sum = 0;
            for (int j = i; j <= i + k ; j++) {
                if (arr[j] == 'G') {
                    sum += 1;
                } else if(arr[j] == 'H') { //h
                    sum += 2;
                }

                totalMax = Math.max(sum, totalMax);
            }
        }
        System.out.println(totalMax);
    }
}

//arr[99] - max. k = 6 > 100 - k i < 94 93 94 95 96 97 98 99