//package practice_.codetree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] str_arr = new char[str.length()];

        for (int i = 0; i < str_arr.length; i++) {
            str_arr[i] = str.charAt(i);
        }

        for (int i = str_arr.length; i > 0; i--) {
            if (i % 2 == 0) {
                System.out.print(str_arr[i-1]);
            }
        }
    }
}