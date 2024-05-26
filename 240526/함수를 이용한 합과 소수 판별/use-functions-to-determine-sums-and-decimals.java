//package codetree.middle.method;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static int a,b;

    public static boolean isPrimeNumber(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDigitSumEven(int x) {
        int digitSum = 0;
        for (int i = 1; i < x; i *= 10) {
            digitSum += (x / i) % 10;
        }
        if (digitSum % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int answer_count = 0;
        a = sc.nextInt();
        b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (isPrimeNumber(i) && isDigitSumEven(i)) {
                answer_count++;
            }
        }

        System.out.println(answer_count);

    }
}