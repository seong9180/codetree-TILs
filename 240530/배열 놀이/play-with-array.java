//package study.codetree.low;

import java.util.Scanner;

public class Main {
    public static int n, q;
    public static final int MAX_N = 100, MAX_Q = 100;
    public static int[] arr = new int[MAX_N];
    public static void query1(int a) {
        //1a 명령 수행
        System.out.println(arr[a-1]);
    }

    public static void query2(int b) {
        //2b 명령 수행
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == b && idx <= i + 1) { //index 중 가장 작은 값을 idx 에 저장
                idx = i + 1;
            }
        }
        if (idx == -1) { //b랑 같은 원소가 없을 경우
            System.out.println(0); //0을 출력
        }else{
            System.out.println(idx);
        }
    }

    public static void query3(int s, int e) {
        //3se 명령 수행
        for (int i = s - 1; i <= e - 1; i++) { //index 는 0부터 시작하기 때문에 각 값에 -1 적용
            System.out.print(arr[i] + " ");
        }
        System.out.println(); //출력이 끝난 뒤 다음 질의를 위해 줄바꿈
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        q = sc.nextInt();

        //n개의 원소를 배열에 저장
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //q 개의 질의를 처리
        for (int i = 0; i < q; i++) {
            int query = sc.nextInt();

            if (query == 1) {
                int a = sc.nextInt();
                query1(a);
            } else if (query == 2) {
                int b = sc.nextInt();
                query2(b);
            } else{ //query == 3
                int s = sc.nextInt();
                int e = sc.nextInt();
                query3(s, e);
            }
        }


    }
}