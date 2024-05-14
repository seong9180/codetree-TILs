//package study.codetree.samsung.sort;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word1 = sc.next();
        String word2 = sc.next();
        boolean same = false;

        char[] arr1 = new char[word1.length()];
        char[] arr2 = new char[word2.length()];

        for (int i = 0; i < word1.length(); i++) {
            arr1[i] = word1.charAt(i);
        }

        for (int i = 0; i < word2.length(); i++) {
            arr2[i] = word2.charAt(i);
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(word1.length() != word2.length()){
            System.out.println("No");
        }else{
            for (int i = 0; i < word1.length(); i++) {
                if (arr1[i] == arr2[i]) {
                    same = true;
                }else{
                    same = false;
                    break;
                }
            }

            if (same) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}