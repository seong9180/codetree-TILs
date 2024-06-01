import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] grid = new int[n][n];
        
        for(int i = 1; i <= m ; i++){ //첫번째 점이 1, k번째 점이 k라서 1부터 시작
            int r = sc.nextInt();
            int c = sc.nextInt();

            grid[r-1][c-1] = i; //m번 반복하는 인덱스를 점의 번호로 사용
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}