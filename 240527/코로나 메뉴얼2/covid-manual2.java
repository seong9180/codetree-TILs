//package codetree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countA = 0, countB = 0, countC = 0, countD = 0;

        for (int i = 0; i < 3; i++) {
            char covid = sc.next().charAt(0);
            int temp = sc.nextInt();

            if (temp >= 37 && covid == 'Y') {
                countA ++;
            } else if (temp >= 37 && covid == 'N') {
                countB ++;
            } else if (temp < 37 && covid == 'Y') {
                countC ++;
            }else{
                countD ++;
            }
        }

        if (countA >= 2) {
            System.out.print(countA + " " + countB + " " + countC + " " + countD + " ");
            System.out.println("E");
        }else{
            System.out.print(countA + " " + countB + " " + countC + " " + countD + " ");
        }

    }
}