//package codetree.middle.method;

import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(String x) {
        char[] arr_front = new char[x.length()];
        char[] arr_back = new char[x.length()];
        int tmp = 0;

        for (int i = 0; i < x.length(); i++) { //정방향으로 본 문자열
            arr_front[i] = x.charAt(i);
        }
        for (int i = x.length() - 1; i >= 0; i--) { //반대로 뒤집은 문자열
            arr_back[tmp] = x.charAt(i);
            tmp++;
        }
        for (int i = 0; i < x.length(); i++) {
            if (arr_front[i] == arr_back[i]) {
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        if (isPalindrome(a)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}