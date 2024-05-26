//package codetree.middle.method;

import java.util.Scanner;

public class Main {
    public static int n,m;
    public static void swap(int x, int y) {
        int temp = 0;
        temp = x;
        x = y;
        y = temp;

        System.out.print(x + " " + y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        swap(n,m);


    }
}