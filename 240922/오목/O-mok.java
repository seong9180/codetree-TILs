import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[19][19];
        int n = 19;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int[] dx = {0, 1, 1, 1};  // 가로, 세로, 대각선(오른쪽 아래), 대각선(오른쪽 위)
        int[] dy = {1, 0, 1, -1};

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (board[x][y] == 0) continue;
                
                for (int dir = 0; dir < 4; dir++) {
                    int count = 1;
                    int nx = x + dx[dir];
                    int ny = y + dy[dir];
                    
                    while (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == board[x][y]) {
                        count++;
                        if (count == 5) {
                            System.out.println(board[x][y]);
                            System.out.println((x + 2*dx[dir] + 1) + " " + (y + 2*dy[dir] + 1));
                            return;
                        }
                        nx += dx[dir];
                        ny += dy[dir];
                    }
                }
            }
        }
        
        System.out.println(0);  // 승리자가 없는 경우
    }
}