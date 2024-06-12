//package study.codetree.low;

import java.util.Scanner;

public class Main {
    public static String shiftRight(String s) {
        int length = s.length();

        return s.charAt(length - 1) + s.substring(0, length - 1);
    }

    public static String shiftLeft(String s) {
        int length = s.length();

        return s.substring(1, length) + s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String command = sc.next();

        char[] command_array = command.toCharArray();
        int command_count = command.length(); //명령의 갯수

        for (int i = 0; i < command_count; i++) {
            if (command_array[i] == 'L') {
                // 좌측으로 shift
                s = shiftLeft(s);
            }else{
                // 우측으로 shift
                s = shiftRight(s);
            }
        }
        System.out.println(s);

    }
}