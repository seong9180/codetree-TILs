//package study.codetree.mid.function;

import java.util.Scanner;

public class Main {
    public static int y;

    public static boolean isLeapYear(int x) {
        if (x % 4 == 0) {
            if (x % 100 == 0 && x % 400 != 0) {
                return false;
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        y = sc.nextInt();

        if (isLeapYear(y)) {
            System.out.println("true");
        }else System.out.println("false");

    }
}