//package study.codetree.samsung.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static boolean isSameString(String x, String t){
        for (int i = 0; i < t.length(); i++) {
            if (x.charAt(i) != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String txt = sc.next();
        String[] input = new String[n];

        for (int i = 0; i < n; i++) {
            input[i] = sc.next();
        }


        Arrays.sort(input);
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (isSameString(input[i], txt)) {
                count ++;
            }

            if (count == k) {
                System.out.println(input[i]);
                break;
            }
        }

    }
}