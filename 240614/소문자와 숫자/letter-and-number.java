//package study.codetree.low;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        //영문자 > 소문자 : ascii 65 ~ 90 || 97 ~ 122
        //숫자 > 그대로 : ascii 48~57
        //나머지 출력 x

        char[] alpha = s.toCharArray();

        for (int i = 0; i < alpha.length; i++) {
            int asc_num = (int) alpha[i];
            if (asc_num >= 48 && asc_num <= 57) { //숫자라면
                System.out.print((char) asc_num);
            } else if (asc_num >= 65 && asc_num <= 90) { //대문자라면
                System.out.print((char) (asc_num + 32));
            } else if (asc_num >= 97 && asc_num <= 122) { //소문자라면
                System.out.print((char) asc_num);
            }
        }

    }
}