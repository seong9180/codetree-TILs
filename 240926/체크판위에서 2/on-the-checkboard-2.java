//package NoviceMid.ExhaustiveSearch;

import java.util.Scanner;

public class Main {
    public static int r, c;
    public static final int MAX_R = 15, MAX_C = 15;
    public static char[][] arr = new char[MAX_R][MAX_C];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        r = sc.nextInt(); //열 : 세로변
        c = sc.nextInt(); //행 : 가로변
        sc.nextLine(); //버퍼에 남은 개행 문자 제거

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }

        int count = 0;
        
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                for (int d = i + 1; d < r - 1; d++) {
                    for (int k = j + 1; k < c - 1; k++) {
                        if (arr[0][0] != arr[i][j] &&
                                arr[i][j] != arr[d][k] &&
                                arr[d][k] != arr[r - 1][c - 1]) {
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println(count);


    }
}