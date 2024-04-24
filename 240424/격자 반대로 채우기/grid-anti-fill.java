import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[10][10];
        int cnt = 1;

        for (int i = 1; i <= n; i++) { //1..2..3..4..n-1
            if (i % 2 != 0) {
                for (int j = 1; j <= n; j++) { //0..1..2..3..4..n-1
                    arr[n-j][n-i] = cnt;
                    cnt++;
                }
            }else{
                for (int j = 0; j < n; j++) {
                    arr[j][n-i] = cnt;
                    cnt++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}