//package study.codetree.mid.function;

import java.util.Scanner;

public class Main {
    public static int a, b;

    public static boolean isPrimeNumber(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (isPrimeNumber(i)) {
                sum += i;
            }
        }

        System.out.println(sum);

    }
}