//package SW_Expert_Academy;

import java.util.Scanner;

public class Main {

    static int[] dx = {0,1,-0,-1}; //동남서북 & 격자에서의 이동이기 떄문에 dx = i , dy = j 로 생각. (행/열)
    static int[] dy = {1,0,-1,-0};

    public static boolean inRange(int x, int y, int n, int m) { //격자 범위 안에 값이 존재하는지 확인하는 함수
        return (0 <= x && x < n && 0 <= y && y < m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //시작 좌표 인덱느는 언제나 [0,0] : 배열 기준!
        //int x = 0;
        //int y = 0;
        //int cnt = 1;
        //int dir_num = 0; //동쪽이 시작 방향
        //int cnt_change_dir = 0; //방향을 바꾼 횟수 저장

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        //시작 좌표 인덱느는 언제나 [0,0] : 배열 기준!
        int dir_num = 0;
        //x,y 값이 += 으로 계속 영향 받고 있었기 때문에 for문 내부에 x,y 초기화를 시켜줘야 했음.

        //System.out.println("n = " + n);
        int[][] arr = new int[n][m];

        int x = 0;
        int y = 0;
        arr[x][y] = 1; //초기값 선언

        for (int j = 2; j <= n * m; j++) { //초기값을 1로 설정했기 때문에 2부터 ~ n*n 까지 루프
        
            int nx = x + dx[dir_num];
            int ny = y + dy[dir_num];

            //System.out.println("i : " + i + " j : " + j + " dir_num : " + dir_num);

            if(!inRange(nx,ny,n,m) || arr[nx][ny] != 0){ //격자 범위 밖을 넘어가려고 하거나, 해당 인덱스에 값이 존재할 때
                dir_num = (dir_num + 1) % 4; //90도 회전
            }

            x += dx[dir_num];
            y += dy[dir_num];

            arr[x][y] = j;
        }

        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}