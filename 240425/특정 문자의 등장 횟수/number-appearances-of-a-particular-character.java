//package codetree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int length = str.length();
        int cnt_1 = 0;
        int cnt_2 = 0;

        for (int i = 0; i < length - 1; i++) {
            if(str.charAt(i) == 'e' && str.charAt(i+1) == 'e'){
                cnt_1 ++;
            }
            //System.out.print(cnt_1 + " "); //'ee' 문자열 등장 횟수

            if(str.charAt(i) == 'e' && str.charAt(i+1) == 'b'){
                cnt_2 ++;
            }
            //System.out.print(cnt_2 + " "); //'ee' 문자열 등장 횟수
        }

        System.out.print(cnt_1 + " "); //'ee' 문자열 등장 횟수
        System.out.print(cnt_2 + " "); //'ee' 문자열 등장 횟수
    }
}