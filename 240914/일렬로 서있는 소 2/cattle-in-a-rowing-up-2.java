//package NoviceMid.ExhaustiveSearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //n 마리의 소
        //번호는 1번부터 n번까지
        //
        //각 소의 키는 ai
        //1번 소의 키는 a1
        //
        //3마리의 서로 다른 소의 위치 (i,j,k)
        //i < j < k 를 만족하며 ai <= aj <= ak 를 만족하는 서로 다른 쌍의 갯수 구하기
        //
        //>> 소의 번호 순서의 크기 비례대로 키도 비례하는 경우의 가짓수
        //
        //첫 번째 줄 n
        //두 번째 줄 n 마리의 소의 키 정보 제공됨

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); //순서대로 주어지는 소의 키
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] <= arr[j] && arr[j] <= arr[k]) {
                        //System.out.println(i + " " + j + " " + k);
                        count++;
                        //System.out.println("count : " + count);
                    }
                }
            }
        }
        System.out.println(count);

    }
}