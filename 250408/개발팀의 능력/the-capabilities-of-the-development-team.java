//package NoviceMid.ExhaustiveSearch.lesson3;

import java.util.Scanner;

public class Main {
    public static int n = 5;
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static int[] abilities = new int[n];
    public static int diff(int i, int j, int k, int l) {
        int totalSum = 0;
        for (int x = 0; x < n; x++) {
            totalSum += abilities[x];
        }

        int sum1 = abilities[i] + abilities[j];
        int sum2 = abilities[k] + abilities[l];
        int sum3 = totalSum - (sum1 + sum2);

        //능력치가 같은 팀이 존재하면, 고려하지 않음.
        if (sum1 == sum2 || sum2 == sum3 || sum1 == sum3) {
            return INT_MAX;
        }

        int ret = Math.abs(sum1 - sum2);
        ret = Math.max(ret, Math.abs(sum1 - sum3));
        ret = Math.max(ret, Math.abs(sum2 - sum3));

        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            abilities[i] = sc.nextInt();
        }

        //2 팀을 정하면 나머지 한명 팀은 자연스럽게 정해짐
        int minDiff = INT_MAX;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        if (i == k || i == l || j == k || j == l) {
                            continue;
                        }else{
                            minDiff = Math.min(minDiff, diff(i, j, k, l));
                        }
                    }

                }
            }
        }

        //최솟값이 갱신 안 된 상태로 마무리되면 -1 출력
        System.out.println(minDiff == INT_MAX ? -1 : minDiff);

    }
}
