//package codetree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int length = str.length();

        char[] arr = new char[length];

        char value1 = str.charAt(0);
        char value2 = str.charAt(1);

        for (int i = 0; i < length; i++) {
            arr[i] = str.charAt(i);
        }

        for (int i = 0; i < length; i++) {
            if(arr[i] == value1){
                arr[i] = value2;
            }else if(arr[i] == value2){
                arr[i] = value1;
            }
        }

        str = String.valueOf(arr);
        System.out.println(str);

    }
}