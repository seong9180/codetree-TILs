//package study.codetree.mid.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String str1, str2;
    public static boolean isSameWord (char[] a, char[] b) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            if (a[i] == b[i]) {
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str1 = sc.next();
        str2 = sc.next();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (isSameWord(arr1, arr2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}