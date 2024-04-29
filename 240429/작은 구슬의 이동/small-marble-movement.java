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
        char d = sc.next().charAt(0);
        if (d == 'U') {
            dir = 0;
        } else if (d == 'R') {
            dir = 1;
        } else if (d == 'D') {
            dir = 2;
        } else {
            dir = 3;
        }
        //(0,0) 을 초기값으로 두고 계산한 뒤, 마지막 좌표만 +1 +1 해주기로
        int x = r - 1;
        int y = c - 1;

        //int time = 0; //진행한 시간


        for (int j = 0; j <= t; j++) { //j번 루프를 도는 게 time 변수와 하는 일이 같아서, 제거함
            if (j == t) {
                System.out.print(x + 1 + " "); //x, y 를 r,c -1 로 설정했기 때문에 다시 바꿔서 출력
                System.out.print(y + 1);
            }
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (!inRange(nx, ny, n)) {
                dir = (dir + 1) % 4; //90도 회전
                dir = (dir + 1) % 4; //90도 회전 (총 180도 회전)
                //방향을 반대로 = 180도 회전
                //time ++;
                continue; //j는 늘리고(time) 다음번 루프를 진행하기 위함. 방향전환에도 시간을 1 소모하기 위함.
            }

            x += dx[dir];
            y += dy[dir];
            //time ++;
        }

    }
}