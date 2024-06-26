//package study.codetree.mid.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String str1, str2;
    public static boolean isSameWord (char[] a, char[] b) {
        int length_a = a.length;
        int length_b = b.length;
        if (length_a != length_b) { //단어의 길이가 다르면 false
            return false;
        }
        for (int i = 0; i < length_a; i++) {
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