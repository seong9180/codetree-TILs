//package codetree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        int length = str2.length();
        char[] str2_arr = new char[length];

        for (int i = 0; i < length; i++) {
            if(i == 0 || i == 1){
                str2_arr[i] = str1.charAt(i);
            }else{
                str2_arr[i] = str2.charAt(i);
            }
        }

        str2 = String.valueOf(str2_arr);
        System.out.println(str2);

    }
}