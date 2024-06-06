//package study.codetree.low;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] arr = str.toCharArray();
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'e') {
                idx = i;
                break; // e 가 맨 처음에 등장 했을 때 인덱스를 저장하고 break
            }
        }

        str = str.substring(0, idx) + str.substring(idx + 1);
        System.out.println(str);

    }
}