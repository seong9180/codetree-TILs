//package study.codetree.mid.function;

import java.util.Scanner;

public class Main {
    public static int a,b;

    public static int power(int x, int y) {
        int powerValue = 1;
        for (int i = 1; i <= y; i++) {
            powerValue *= x;
        }
        return powerValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(power(a,b));
    }
}