//package study.codetree.mid.dxdy;

import java.util.Scanner;

public class Main {
    //상하좌우 인접 - dx dy 사용해보기
    //격자에서의 dx dy = i, j 순서라는 걸 기억하기
    //문제에서 주어진 단어가 상하좌우여도, 조건에 따라 각도 변환 하려면 360도 순서대로 배치해야 함. 북 > 동 > 남 > 서 순(초기값 안 중요)
    static int[] dx = {-1, 0, 1, 0}; //상우하좌 URDL
    static int[] dy = {0, 1, 0, -1};

    public static boolean inRange(int x, int y, int n) {
        return (0 <= x && x < n && 0 <= y && y < n) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //n*n grid
        int t = sc.nextInt(); //sec
        int[][] arr = new int[n][n];

        int r = sc.nextInt();
        int c = sc.nextInt();

        int dir;
        char d = sc.next().charAt(0); //
        if (d == 'U') {
            dir = 0;
        } else if (d == 'R') {
            dir = 1;
        } else if (d == 'D') {
            dir = 2;
        } else {
            dir = 3;
        }

        int x = r - 1;
        int y = c - 1;

        int time = 0; //진행한 시간

        //격자 맨 처음 좌표가 1,1
        //(0,0) 을 초기값으로 두고 계산한 뒤, 마지막 좌표만 +1 +1 해주기로
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (time == t) {
                    System.out.print(x + 1 + " ");
                    System.out.print(y + 1);
                }
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (!inRange(nx, ny, n)) {
                    dir = (dir + 1) % 4; //90도 회전
                    dir = (dir + 1) % 4; //90도 회전 (총 180도 회전)
                    time ++;
                    continue;
                }

                x += dx[dir];
                y += dy[dir];
                time ++;
            }
        }
    }
}