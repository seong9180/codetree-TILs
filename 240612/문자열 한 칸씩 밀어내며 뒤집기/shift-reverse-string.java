//package study.codetree.low;

import java.util.Scanner;

public class Main {
    public static String s;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        s = sc.next();

        int q = sc.nextInt();
        int[] command = new int[q];

        for (int i = 0; i < q; i++) {
            command[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            if (command[i] == 1) {
                s = shiftLeft(s);
                System.out.println(s);
            } else if (command[i] == 2) {
                s = shiftRight(s);
                System.out.println(s);
            }else{
                s = reverseString(s);
                System.out.println(s);
            }
        }
    }
    public static String shiftLeft(String str) {
        int length = str.length();
        return str.substring(1,length) + str.charAt(0);
    }

    public static String shiftRight(String string) {
        int length = string.length();
        return string.charAt(length - 1) + string.substring(0, length - 1);
    }

    public static String reverseString(String string) {
        int length = string.length();
        StringBuffer sb = new StringBuffer(string);
        String revsb = sb.reverse().toString();

        return revsb;
    }
}