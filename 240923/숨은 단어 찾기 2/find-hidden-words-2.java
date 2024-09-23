import java.util.Scanner;

public class Main {
    static int N, M;
    static char[][] board;
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int count = countLEE();
        System.out.println(count);

        sc.close();
    }

    static int countLEE() {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (board[i][j] == 'L') {
                    count += searchLEE(i, j);
                }
            }
        }
        return count;
    }

    static int searchLEE(int x, int y) {
        int count = 0;
        for (int dir = 0; dir < 8; dir++) {
            int nx1 = x + dx[dir];
            int ny1 = y + dy[dir];
            int nx2 = nx1 + dx[dir];
            int ny2 = ny1 + dy[dir];

            if (nx2 >= 0 && nx2 < N && ny2 >= 0 && ny2 < M) {
                if (board[nx1][ny1] == 'E' && board[nx2][ny2] == 'E') {
                    count++;
                }
            }
        }
        return count;
    }
}