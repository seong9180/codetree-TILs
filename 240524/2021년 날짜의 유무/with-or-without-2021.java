//package codetree.middle.method;

import java.util.Scanner;

public class Main {
   public static int m, d; //month , day

    public static boolean isDayin2021(int m, int d) {
        if (m > 12 || d > 31) {
            return false;
        } else if (1 <= m && m <= 7) { //1월 ~ 7월
            if (m % 2 != 0) {
                return d <= 31;
            } else if (m == 2) {
                return d <= 28;
            } else {
                return d <= 30;
            }
        } else { //8월 ~ 12월
            if (m % 2 != 0) {
                return d <= 30;
            } else {
                return d <= 31;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();

        if (isDayin2021(m, d)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}