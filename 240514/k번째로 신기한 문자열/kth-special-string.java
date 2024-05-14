//package study.codetree.samsung.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static boolean isSameString(String x, String y){
        return (x.charAt(0) == y.charAt(0) && x.charAt(1) == y.charAt(1));
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
            }
        }

    }
}