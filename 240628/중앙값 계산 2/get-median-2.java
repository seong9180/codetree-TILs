//package study.codetree.mid.sort;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int n; //n은 홀수
    public static final int MAX_N = 100;
    public static int[] arr = new int[MAX_N];

    public static void middleValueOut(int idx, int[] arr) {
        int index = 0;
        if(idx != 0){
            index = idx / 2 + 1; //idx / 2 => 중간 값 인덱스 ;; 왜 + 1 해야 맞지?
        }

        System.out.print(arr[index] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i % 2 != 0 || i == 0) { //i == 0 or i 가 홀수 일 때
                middleValueOut(i,arr);
                //System.out.println(arr.length);
            }
        }
    }
}