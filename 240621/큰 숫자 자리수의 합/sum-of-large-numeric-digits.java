//package study.codetree.mid.recursive;
import java.util.Scanner;

public class Main {
    public static int sum = 0;
    public static int digitSum(int x){
        if (x == 0) {
            return sum;
        }
        sum += x % 10;
        return digitSum(x / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        int mux = 1;
        for (int i = 0; i < 3; i++) {
            mux *= arr[i];
        }
        //System.out.println(mux);

        int answer = digitSum(mux);
        System.out.println(answer);

    }
}