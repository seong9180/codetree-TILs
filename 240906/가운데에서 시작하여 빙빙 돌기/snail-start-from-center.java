//package NoviceMid.Simulation2;

import java.util.Scanner;

public class Main {
    public static int n;
    public static final int MAX_N = 100;
    //서 북 동 남
    public static int[] dx = {0, -1, 0, 1};
    public static int[] dy = {-1, 0, 1, 0};
    public static int[][] arr = new int[MAX_N][MAX_N];

    public static boolean inRange(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }

    public static void main(String[] args) {
        //n 은 홀수
        //n * n 의 정사각형 형태
        //
        //움직이는 규칙을 찾아야 함.
        //언제나 우측 하단에서 끝나는데 우측 하단부터 숫자가 줄어들면서
        //돌아가는 방향으로 설계하면 안 될까?
        //
        //우측 하단 좌표는 (n-1, n-1)
        //값은 n^2
        //
        //시작 방향은 서 북 동 남 (우측 90도 회전)

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int x = n - 1;
        int y = n - 1;
        int nx, ny;
        int dirNum = 0; //서쪽
        int start = n * n;
        arr[x][y] = start;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nx = x + dx[dirNum];
                ny = y + dy[dirNum];

                if (!inRange(nx, ny) || arr[nx][ny] != 0) {
                    dirNum = (dirNum + 1) % 4;
                    nx = x + dx[dirNum];
                    ny = y + dy[dirNum];

                    if (!inRange(nx, ny) || arr[nx][ny] != 0) {
                        break;
                    }
                }
                start--;
                arr[nx][ny] = start;
                x += dx[dirNum];
                y += dy[dirNum];

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