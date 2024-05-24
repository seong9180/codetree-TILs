//package codetree.middle;

import java.util.Scanner;

public class Main {
    public static void add(int x, int y) {
        int sum =  x + y;
        System.out.print(x + " + " + y + " = " + sum);
    }
    public static void sub(int x, int y) {
        int sub = x - y;
        System.out.print(x + " - " + y + " = " + sub);
    }
    public static void multiplication(int x, int y) {
        int mux = x * y;
        System.out.print(x + " * " + y + " = " + mux);
    }
    public static void division(int x, int y) {
        int div = x / y;
        System.out.print(x + " / " + y + " = " + div);
    }
    public static boolean isRightSymbol(char x) {
        return (x == '+' || x == '-' || x == '/' || x == '*');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); //피연산자 (정수)
        char o = sc.next().charAt(0); //연산기호
        int c = sc.nextInt(); //피연산자 (정수)

        //System.out.println("o = " + o);

        if (isRightSymbol(o)) {
            if (o == '+') {
                add(a, c);
            } else if (o == '-') {
                sub(a, c);
            } else if (o == '*') {
                multiplication(a, c);
            } else {
                division(a, c);
            }
        }else{
            System.out.println("False");
        }
    }
}