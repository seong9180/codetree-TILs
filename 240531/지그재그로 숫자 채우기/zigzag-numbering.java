import java.util.Scanner;

public class Main {
    public static int n,m;
    public static final int MAX = 100;

    public static int[][] grid = new int[MAX][MAX];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        // 00 10 20 30 01 11 21 31
        // 00 10 20 30 31 21 11 01 >>>>>>>

        //홀수행 (down) 짝수행 (up)
        int count = 0;
        for(int i = 0 ; i < m; i++){
            for(int j = 1 ; j <= n ; j++){
                if(i % 2 == 0){ // (열)이 짝수 인덱스일 때 (0,2,4...)
                    grid[j-1][i] = count; // 00 10 20 30 40
                    count ++;
                }else{ // (열)이 홀수 인덱스일 때 (1,3,5...)
                    grid[n-j][i] = count;
                    count ++;
                }
            }
        }

        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < m; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}