//package NoviceMid.Simulation2;

import java.util.Scanner;

public class Main {
    public static int n,m;
    public static final int MAX_N = 100, MAX_M = 100;
    public static int[] dx = {0, 1, 0, -1}; //동남서북
    public static int[] dy = {1, 0, -1, 0};
    //00 01 02 03
    //10 11 12 13
    //20 21 22 23
    //30 31 32 33

    public static boolean inRange(int x , int y) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        char start = 65; //시작 알파벳 A
        int x = 0;
        int y = 0;
        int nx,ny;
        int dirNum = 0; //동쪽을 기준으로 지정

        char[][] arr = new char[MAX_N][MAX_N];
        arr[0][0] = start;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nx = x + dx[dirNum];
                ny = y + dy[dirNum];

                if (!inRange(nx, ny) || arr[nx][ny] != 0) { // !inRange
                    dirNum = (dirNum + 1) % 4; //90도 회전. (dirNum + 1)
                    nx = x + dx[dirNum];
                    ny = y + dy[dirNum];

                    if (!inRange(nx,ny) || arr[nx][ny] != 0) { //방향 전환 이후에도 nx,ny 자리에 어떤 값이 있다면.
                        break; //종료
                    }
                }
                start++; //다음 알파벳으로 이동
                if (start > 90) { //아스키코드에서 Z 이후로 넘어가면
                    start = 65; //다시 대문자 A로 변환
                }
                arr[nx][ny] = start;

                x += dx[dirNum];
                y += dy[dirNum];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }



}