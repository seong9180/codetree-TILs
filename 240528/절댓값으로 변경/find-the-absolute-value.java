//package study.codetree.mid.function;

import java.util.Scanner;

public class Main {
    public static int n;
    //public static int[] real_arr = new int[n];
    //배열을 인자로 받는 함수 + 각각 절대값 + 값을 반환하지 않아야
    public static void makeAbsolute(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if (arr[i] < 0) { //배열의 값 중 음수가 있으면 -1을 곱해줌
                arr[i] *= -1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int[] real_arr = new int[n];
        for (int i = 0; i < n; i++) {
            real_arr[i] = sc.nextInt();
        }

        makeAbsolute(real_arr);
        for (int i = 0; i < n; i++) {
            System.out.print(real_arr[i] + " ");
        }
    }
}