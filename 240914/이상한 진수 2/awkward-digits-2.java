//package NoviceMid.ExhaustiveSearch;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int calculate(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += (int) (input[i] * Math.pow(2, input.length - i - 1));
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number = sc.next();

        char[] input = number.toCharArray();
        int length = input.length;
        int[] intArray = new int[length];
        for (int i = 0; i < length; i++) {
            intArray[i] = input[i] - '0'; //char 값을 int 로 변환
        }

        int maxCount = 0;
        for (int i = 0; i < length; i++) {
            int[] newArr = Arrays.copyOf(intArray, length); //intArray 의 복사본 newArr 를 매 for 문마다 복사
            if (intArray[i] == 1) {
                newArr[i] = 0;
            } else if(intArray[i] == 0) {
                newArr[i] = 1;
            }
            maxCount = Math.max(maxCount, calculate(newArr));
        }

        System.out.println(maxCount);
    }
}