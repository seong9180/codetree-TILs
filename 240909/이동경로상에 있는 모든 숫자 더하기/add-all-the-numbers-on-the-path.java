//package NoviceMid.Simulation2;

import java.util.Scanner;

public class Main {
    public static int n, t;
    public static final int MAX_N = 99;
    public static final int MAX_T = 100000;
    public static int[] dx = {0, 1, 0, -1}; //동남서북
    public static int[] dy = {1, 0, -1, 0};
    public static int[][] arr = new int[MAX_N][MAX_N];

    public static boolean inRange(int x, int y) {
        return(x >= 0 && x < n && y >=0 && y < n);
    }
    // L 왼쪽으로 90도 R 오른쪽으로 90도 F 방향대로 한 칸 전진
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); //격자 크기 n * n
        t = sc.nextInt(); //명령의 갯수

        int dirNum = 3; //기본 방향은 북쪽.
        String input = sc.next();
        char[] command = input.toCharArray();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //시작 위치 = 중심 n 은 홀수
        int x = n / 2;
        int y = n / 2;

        int sum = arr[x][y]; //총합을 더할 변수 : 시작좌표인 중심 값에서부터 시작
        //명령에 따라 이동 혹은 방향 전환
        for (int i = 0; i < t; i++) {
            if (command[i] == 'L') {
                dirNum = (dirNum + 3) % 4;
            } else if (command[i] == 'R') {
                dirNum = (dirNum + 1) % 4;
            } else { //command = F
                //x,y 위치 이동.
                int nx = x + dx[dirNum];
                int ny = y + dy[dirNum];

                if (inRange(nx, ny)) { //해당 명령으로 이동 후 격자 범위 안에 있을 때에만 실행
                    x += dx[dirNum];
                    y += dy[dirNum];
                    sum += arr[x][y];
                }
            }
        }
        System.out.println(sum);

    }
}