//package study.codetree.low;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String s = sc.next();
       char[] alpha = s.toCharArray();

        for (int i = 0; i < alpha.length; i++) {
            int asc_num = (int) alpha[i];

            if (asc_num >= 65 && asc_num <= 90) {
                asc_num += 32;
                System.out.print((char) asc_num);
            } else if (asc_num >= 97 && asc_num <= 122) {
                asc_num -= 32;
                System.out.print((char) asc_num);
            }
        }
    }
}