import java.util.*;

public class Main {
    //달팽이 모양 : 동 > 남 > 서 > 북
    public static int[] dx = {0,1,0,-1};
    public static int[] dy = {1,0,-1,0};

    public static boolean inRange (int x, int y, int n, int m){
        return (0 <= x && x < n && 0 <= y && y < m);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] grid = new int[n][m];
        int dir = 0;
        int fill = 1;

        int x = 0;
        int y = 0;

        for(int i = 1; i <= n * m; i++){
            grid[x][y] = fill;
            fill ++;

            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if(!inRange(nx,ny,n,m) || grid[nx][ny] != 0){
                dir = (dir + 1) % 4;
            }

            x += dx[dir];
            y += dy[dir];    
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }        
    }
}