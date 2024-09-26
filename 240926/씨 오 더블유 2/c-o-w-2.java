//package NoviceMid.ExhaustiveSearch;

import java.util.Scanner;

public class Main {
    public static int n;
    public static final int MAX_N = 100;
    //public static int[] arr = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        sc.nextLine(); // 개행 버퍼 제거
        String input = sc.next();
        char[] arr = input.toCharArray();
        int length = arr.length;

        int count= 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] == 'C') {
                for (int j = i + 1; j < length; j++) {
                    if (arr[j] == 'O') {
                        for (int k = j + 1; k < length; k++) {
                            if (arr[k] == 'W') {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);

    }
}