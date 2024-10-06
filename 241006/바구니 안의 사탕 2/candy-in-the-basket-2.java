//package NoviceMid.ExhaustiveSearch;

import java.util.Scanner;

public class Main {
    public static int n,k;
    public static final int MAX_N = 100;
    public static int[] basket = new int[101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        int[] candy = new int[101];

        for (int i = 0; i < n; i++) {
            int candys = sc.nextInt();
            int pos = sc.nextInt();

            candy[pos] += candys; //바구니의 위치는 0부터 시작. (인덱스와 동일)
        }

        int answer = 0;
        if (k >= 50) { //k 가 50 이상이면 무조건 최대값은 "모든 캔디의 합" 이 됨
            for (int i = 0; i < candy.length; i++) {
                //System.out.print("candy 총 갯수 : " + answer);
                answer += candy[i];
                //System.out.print(" 더해질 캔디 : " + candy[i]);
                //System.out.println(" i : " + i);
            }
        } else {
            for (int i = 0; i < candy.length; i++) {
                //중심점이 i 인 경우를 완전탐색
                int candySum = 0;
                if (i - k >= 0 && i + k <= 100) {
                    //System.out.println("1");
                    for (int j = i - k; j <= i + k; j++) {
                        candySum += candy[j];
                    }
                } else if(i - k < 0 && i + k <= 100) {
                    //System.out.println("2");
                    for (int j = 0; j <= i + k; j++) {
                        candySum += candy[j];
                    }
                } else if (i - k >= 0 && i + k > 100) {
                    //System.out.println("3");
                    for (int j = i - k; j <= 100; j++) {
                        candySum += candy[j];
                    }
                } else {
                    //System.out.println("4");
                    for (int j = 0; j <= 100; j++) {
                        candySum += candy[j];
                    }
                }

                answer = Math.max(candySum, answer);
            }
        }


        System.out.println(answer);

    }
}