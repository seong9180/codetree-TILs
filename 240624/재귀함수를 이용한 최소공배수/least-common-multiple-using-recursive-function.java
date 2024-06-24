//package study.codetree.mid.recursive;
import java.util.Scanner;

public class Main{
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    //두 수의 최소공배수를 구하는 함수
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    //n개의 수의 최소공배수를 재귀적으로 구하는 함수
    public static int lcmOfArray(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return lcm(arr[n - 1], lcmOfArray(arr, n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(lcmOfArray(arr, n));
        sc.close();

    }
}