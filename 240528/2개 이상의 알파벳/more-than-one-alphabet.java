//package study.codetree.mid.function;

import java.util.Scanner;

public class Main {

    public static int countDiffAlphabet(String a) {
        int length = a.length();
        char[] alphabet = new char[length];

        for (int i = 0; i < length; i++) {
            alphabet[i] = a.charAt(i);
        }

        int total_count = 0;
        for (int i = 0; i < length; i++) {
            int count = 0;
            for (int j = 0; j < length; j++) {
                if (alphabet[i] != alphabet[j]) {
                    count ++;
                }
                if (count >= 1) {
                    total_count ++;
                    continue;
                }
            }
        }
        return total_count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        if (countDiffAlphabet(a) >= 2) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}