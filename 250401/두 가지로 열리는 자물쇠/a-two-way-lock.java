//package NoviceMid.ExhaustiveSearch.lesson3;

import java.util.Scanner;

public class Main {
    public static int n;
    public static int a;
    public static int b;
    public static int c;
    public static int a2;
    public static int b2;
    public static int c2;

    public static boolean comb1(int i , int j , int k){
        return(mintDistance(i,a) <= 2 && mintDistance(j,b) <= 2 && mintDistance(k,c) <= 2);
    }

    public static boolean comb2(int i , int j , int k){
        return(mintDistance(i,a2) <= 2 && mintDistance(j,b2) <= 2 && mintDistance(k,c2) <= 2);
    }

    public static boolean isOpenable(int i, int j , int k) {
        return (comb1(i, j, k) || comb2(i, j, k));
    }

    public static int mintDistance(int i, int x) {
        //n = 9, i = 2, x = 8
        //mindis = 9 - 2 = 7
        //rounddis = (9 + 2) % 9 + (9 - 8) = 3
        int minDistance = Math.abs(x - i);
        int roundDistance = n - minDistance; //원을 그려서 이해하기
        return minDistance = Math.min(minDistance, roundDistance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        a2 = sc.nextInt();
        b2 = sc.nextInt();
        c2 = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (isOpenable(i, j, k)) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
