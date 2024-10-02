//package NoviceMid.ExhaustiveSearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                double valAvg = 0;
                int count = 0;
                for (int k = i; k <= j; k++) {
                    valAvg += arr[k];
                    count++;
                    //System.out.println("k = " + k + " valAvg = " + valAvg + " count = " + count);
                }
                valAvg /= count;
                //System.out.println("i = " + i + " j = " + j + " valAvg = " + valAvg);
                for (int k = i; k <= j; k++) {
                    if (valAvg == arr[k]) {
                        answer++;
                        break;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}