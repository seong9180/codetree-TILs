//package study.codetree.mid.function;

import java.util.Scanner;

public class Main {
   public static int a = 0, b = 0;

    public static boolean is396(int x) {
        for (int i = 1; i <= x; i *= 10) {
            if ((x / i) % 10 == 3 || (x / i) % 10 == 6 || (x / i) % 10 == 9) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        int count = 0;

        for (int i = a; i <= b; i++) {
            if (is396(i) || i % 3 == 0) {
                count ++;
            }
        }

        System.out.println(count);

    }
}