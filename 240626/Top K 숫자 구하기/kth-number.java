//package study.codetree.mid.sort;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //1. 오름차순 정렬
        Arrays.sort(arr); //내림차순 정렬

        //오름차순 k 번째 숫자 = 내림차순 n-k 번째 숫자
        System.out.println(arr[k-1]); // 인덱스는 0부터 시작

    }
}