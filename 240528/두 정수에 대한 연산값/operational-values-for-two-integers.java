//package study.codetree.mid.function;

import java.util.Scanner;

public class Main {
    public static int a , b;
    public static  int bigFunc(int a, int b) {
        int max = 0;
        if (a >= b) {
            a += 25;
            b *= 2;
            max = a;
        }else{
            b += 25;
            a *= 2;
            max = b;
        }
        return max;
    }
    public static int smallFunc(int a, int b) {
        int min = 0;
        if (a >= b) {
            a += 25;
            b *= 2;
            min = b;
        }else{
            b += 25;
            a *= 2;
            min = a;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        if (a >= b) {
            System.out.println(bigFunc(a, b) + " " + smallFunc(a, b));
        }else{
            System.out.println(smallFunc(a, b) + " " + bigFunc(a, b));
        }


    }
}