//package NoviceMid.ExhaustiveSearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        char[] parenthesis = input.toCharArray();
        int length = parenthesis.length;
        int count = 0;

        for (int i = 0; i < length - 1; i++) { //연속한 괄호 쌍을 파악해야 해서 -1
            if (parenthesis[i] == '(' && parenthesis[i + 1] == '(') {
                for (int j = i + 1; j < length - 1; j++) {
                    if (parenthesis[j] == ')' && parenthesis[j + 1] == ')') {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}