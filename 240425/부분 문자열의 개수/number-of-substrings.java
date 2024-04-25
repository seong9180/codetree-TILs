//package codetree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str_A = sc.nextLine();
        String str_B = sc.nextLine();

        int cnt = 0;
        int length = str_A.length();

        for (int i = 0; i < length - 1; i++) {
            if(str_A.charAt(i) == str_B.charAt(0) && str_A.charAt(i+1) == str_B.charAt((1))){
                cnt ++;
            }
        }
        System.out.println(cnt);

    }
}