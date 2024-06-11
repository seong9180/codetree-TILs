//package study.codetree.low;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int length = str.length();
        System.out.println(str); //원래 문자열 출력
        for (int i = 1; i <= length; i++) {
            String rotated = rotateRight(str, i);
            System.out.println(rotated);
        }
    }

    public static String rotateRight(String str, int n) {
        int length = str.length();
        n = n % length;
        return str.substring(length - n) + str.substring(0, length - n);
    }
}