//package NoviceMid.ExhaustiveSearch.lesson3;

import java.util.Scanner;

public class Main {
    //한 가지로 열리는 자물쇠
    public static int[] number = new int[6];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //4명의 사람이 숫자를 하나씩 들고 있으며, 그 숫자는 순서대로 [1, 5, 3, 6] 입니다.
        //이때, 두 사람씩 한 팀을 이루도록 4명을 2명 / 2명으로 잘 나눠
        //각 팀 내의 숫자 합의 차이가 최소가 되도록 해보세요.

        for (int i = 0; i < 6; i++) {
            number[i] = sc.nextInt();
        }

        int minDiff = 6 * 1000000;

        for(int i  = 0 ; i< 6; i++){
            for (int j = i + 1; j < 6; j++) {
                for(int k = j + 1; k < 6; k++){
                    minDiff = Math.min(minDiff, getDiff(i, j, k));
                }
            }
        }
        System.out.println(minDiff);



    }

    public static int getDiff(int i, int j, int k) {
        int sum1 = 0, sum2 = 0;

        //첫 조합을 고르면, 자연스럽게 나머지 조합의 합이 정해짐. (전체 합) - (첫 조합의 합)
        sum1 = number[i] + number[j] + number[k];

        for(int x = 0 ; x < 6; x++){
            sum2 += number[x];
        }
        sum2 -= sum1;
        return Math.abs(sum2 - sum1);
    }
}
