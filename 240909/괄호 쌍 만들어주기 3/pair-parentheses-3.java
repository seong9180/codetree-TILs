//package NoviceMid.ExhaustiveSearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        char[] parenthesis = input.toCharArray();
        int length = parenthesis.length;
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (parenthesis[i] == '(') {
                for (int j = i + 1; j < length; j++) {
                    if (parenthesis[j] == ')') {
                        count ++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}