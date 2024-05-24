//package codetree.middle.method;

import java.util.Scanner;

public class Main {
   public static int n1, n2;
   public static final int MAX_N1 = 100, MAX_N2 = 100;
   public static int[] arr1 = new int[MAX_N1 * 2];
   public static int[] arr2 = new int[MAX_N2 * 2];

    public static boolean isConsecSubseq() {
        boolean check = false;
        int count = 0;
        if (n2 > n1) { //B 수열의 크기가 A 수열보다 큰 경우 : 절대 부분수열이 될 수 없음.
            return false;
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if(arr1[i + j] == arr2[j]){
                    count ++;
                }else{
                    count = 0;
                }

                if (count >= n2) {
                    check = true;
                }
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt(); //수열 a의 원소의 개수
        n2 = sc.nextInt(); //수열 b의 원소의 개수

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        if (isConsecSubseq()) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}