//package NoviceMid.ExhaustiveSearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //밭의 개수
        int h = sc.nextInt(); //height
        int t = sc.nextInt(); //length

        int[] field = new int[n];

        for (int i = 0; i < n; i++) {
            field[i] = sc.nextInt();
        }

        int minPrice = 2000;

        for (int i = 0; i <= n - t; i++) {
            int price = 0;
            for (int j = 0; j < t; j++) {
                price += Math.abs(field[i + j] - h);
            }
            minPrice = Math.min(minPrice, price);
        }

        System.out.println(minPrice);
    }


}
