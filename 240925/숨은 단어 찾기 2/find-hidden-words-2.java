//package NoviceMid.ExhaustiveSearch;

import java.util.Scanner;

public class Main {
    public static int n, m;
    public static final int MAX_N = 50, MAX_M = 50;
    public static char[][] arr = new char[MAX_N][MAX_M];
    public static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    public static int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};

    public static boolean inRange(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < m);
    }

    public static int countLee(int x, int y) {
        int count = 0;
        for (int dir = 0; dir < 8; dir++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            int nx2 = x + 2 * dx[dir];
            int ny2 = y + 2 * dy[dir];
            if (inRange(nx2, ny2) && arr[nx][ny] == 'E' && arr[nx2][ny2] == 'E') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        int dir = 0;
        int x = 0, y = 0;
        int count = 0;
        //1. L 을 찾는다

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 'L') {
                    count += countLee(i, j);
                }
            }
        }
        System.out.println(count);

    }
}