//package study.codetree.mid.function;

import java.util.Scanner;

public class Main {
    public static int a, b;

    public static int funcBig(int a, int b) {
        if (a >= b) {
            a *= 2;
            b += 10;
            return a;
        }else{
            b *= 2;
            a += 10;
            return b;
        }
    }
    public static int funcSmall(int a, int b) {
        if (a >= b) {
            a *= 2;
            b += 10;
            return b;
        }else{
            b *= 2;
            a += 10;
            return a;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        if (a >= b) {
            System.out.println(funcBig(a, b) + " " + funcSmall(a, b));
        }else{
            System.out.println(funcSmall(a, b) + " " + funcBig(a, b));
        }

    }
}