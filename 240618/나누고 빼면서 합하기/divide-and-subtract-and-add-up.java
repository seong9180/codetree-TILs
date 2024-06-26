//package study.codetree.mid.function;

import java.util.Scanner;

public class Main {
    public static int n, m;
    public static final int max_n = 100;

    public static int calculateM(int m) {
        if (m % 2 != 0) {
            m -= 1;
        }else{
            m /= 2;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = arr[m - 1];
        while(true){
            m = calculateM(m);
            if (m == 1) {
                sum += arr[m-1];
                break;
            }else{
                sum += arr[m-1];
            }
        }

        System.out.println(sum);
    }
}