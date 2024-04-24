//package practice_.codetree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strA = sc.nextLine();
        String strB = sc.nextLine();

        //System.out.println(strA + " " + strB);

        char[] arrA = new char[strA.length()];
        char[] arrB = new char[strB.length()];

        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = strA.charAt(i);
        }
        for (int i = 0; i < arrB.length; i++) {
            arrB[i] = strB.charAt(i);
        }

        for (int i = 0; i < 1; i++) {
            if(arrA[i] == arrB[i] && arrA[i+1] == arrB[i+1]){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }
}