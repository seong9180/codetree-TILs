//package NoviceMid.ExhaustiveSearch;

import java.util.Scanner;

public class Main {
    public static int n;
    public static final int MAX_N = 20;
    public static final int MAX = 10000;
    public static int[] input = new int[MAX_N];

    public static boolean isCarry(int a, int b, int c) {
        int[] arrA = new int[5]; //최대값이 10000, 자릿수 기준으로 배열은 5 크기로 생성
        int[] arrB = new int[5];
        int[] arrC = new int[5];

        for (int i = 0; i < 5; i++) {
            if (a > 0) {
                arrA[i] = a % 10;
                a /= 10;
            }if (b > 0) {
                arrB[i] = b % 10;
                b /= 10;
            }if (c > 0) {
                arrC[i] = c % 10;
                c /= 10;
            }
        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println(arrA[i] + " " + arrB[i] + " " + arrC[i]);
//        }

        for (int i = 0; i < 5; i++) {
            if (arrA[i] + arrB[i] + arrC[i] >= 10) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        int maxTotal = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (isCarry(input[i], input[j], input[k])) {
                        maxTotal = Math.max(input[i] + input[j] + input[k], maxTotal);
                    }
                }
            }
        }

        if (maxTotal == 0) { //maxTotal == 0 이라는 건, carry 를 피하는 조합이 없다는 뜻
            System.out.println(-1);
        }else{
            System.out.println(maxTotal);
        }
    }
}