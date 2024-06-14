//package study.codetree.low;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char number = '3';
        int x = (int) number - 'a';
        //System.out.println("3 - 'a' = " + x);

        char zero = '0';
        char nine = '9';
        //System.out.println("nine = " + ((int) nine - 'a'));
        //System.out.println("zero = " + ((int) zero - 'a'));
        //아스키 코드가 기억나지 않아도, 경계가 되는 두 수 - 'a' 를 경계로 삼으면 됨.

        char[] alpha = s.toCharArray();
        int sum = 0;

        //48 ~ 57
        for (int i = 0; i < alpha.length; i++) {
            int asc_num = (int) alpha[i];
            if (asc_num >= 48 && asc_num <= 57) {
                sum += alpha[i] - '0'; // 아스키 코드로 문자 > 정수형으로 변환
            }
        }

        System.out.println(sum);
        


    }
}