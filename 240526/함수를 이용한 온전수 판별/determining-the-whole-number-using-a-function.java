//package codetree.middle.method;

import java.util.Scanner;

public class Main {
    public static int a,b;

    public static boolean isDiv2(int x) {
        if (x % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isDigitOneis5(int x) {
        if (x % 10 == 5) {
            return true;
        }
        return false;
    }

    public static boolean isDiv3notDiv9(int x) {
        if (x % 3 == 0 && x % 9 != 0) {
            return true;
        }
        return false;
    }

    public static boolean isPerfect(int x) {
        if (!isDiv2(x) && !isDigitOneis5(x) && !isDiv3notDiv9(x)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        a = sc.nextInt();
        b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (isPerfect(i)) {
                count ++;
            }
        }

        System.out.println(count);

    }
}