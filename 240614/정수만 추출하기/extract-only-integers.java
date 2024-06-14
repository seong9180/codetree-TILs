//package study.codetree.low;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        char[] char_a = a.toCharArray();
        char[] char_b = b.toCharArray();

        String new_a = "";
        String new_b = "";

        for (int i = 0; i < char_a.length; i++) {
            int asc_num = (int) char_a[i];
            if (asc_num < 48 || asc_num > 57) { //숫자가 아니면,
                break;
            }else{
                new_a += char_a[i];
            }
        }

        for (int i = 0; i < char_b.length; i++) {
            int asc_num = (int) char_b[i];
            if (asc_num < 48 || asc_num > 57) { //숫자가 아니면,
                break;
            }else{
                new_b += char_b[i];
            }
        }

        int sum = Integer.parseInt(new_a) + Integer.parseInt(new_b);
        System.out.println(sum);
        
    }
}