//package study.codetree.low;

import java.util.Scanner;

public class Main {
    public static int n1, n2;
    public static final int MAX_N1 = 100, MAX_N2 = 100;
    //n1, n2 가 동일한 100크기의 배열인 경우를 대비해 배열 최대값을 200으로 설정
    public static int[] arr1 = new int[MAX_N1 + MAX_N2]; 
    public static int[] arr2 = new int[MAX_N2 + MAX_N1];

    public static boolean isSequentSubString() {
        boolean check = false;
        if (n2 > n1) { //b의 수열이 a의 수열보다 크기가 큰 경우는 비교하지 않고 false
            return check;
        }
        
        for (int i = 0; i < n1; i++) {
            if (arr1[i] == arr2[0]) { //연속 부분수열 판별이기 떄문에 무조건 arr2의 시작은 0번째부터
                for (int j = 0; j < n2; j++) {
                    if (arr1[i + j] == arr2[j]) {
                        check = true;
                    }else{
                        check = false;
                    }
                }
                if (check) { //b수열 전부를 비교한 뒤 부분수열이 맞으면
                    break;
                }
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        if (isSequentSubString()) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}