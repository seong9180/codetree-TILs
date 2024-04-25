//package codetree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int length = str.length();
        char[] arr = new char[length];

        for (int i = 0; i < length; i++) {
            arr[i] = str.charAt(i);
        }

        //System.out.println("arr[length-1] = " + arr[length-1]);

        arr[1] = 'a';
        arr[length-2] = 'a'; //배열 인덱스 상, 맨 끝값이 length-1 이기 때문
        

        str = String.valueOf(arr);
        System.out.println(str);

    }
}