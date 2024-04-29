//package study.codetree.mid.dxdy;

import java.util.Scanner;

public class Main {
    //상하좌우 인접 - dx dy 사용해보기
    //격자에서의 dx dy = i, j 순서라는 걸 기억하기
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static boolean inRange(int x, int y, int n) {
        return (0 <= x && x < n && 0 <= y && y < n) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //입력 n
        int[][] arr = new int[n][n];

        //격자 정보 입력받기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        /* 격자 입력 확인
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/


        int cnt_one = 0; //인접한 숫자를 세는 변수 선언
        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cnt_one = 0;
                for (int d = 0; d < 4; d++) {
                    int nx = i + dx[d];
                    int ny = j + dy[d];
                    //System.out.println("i = " + i + ", j = " + j + ", d = " + d + ", nx = " + nx + ", ny = " + ny);

                    //nx,ny 가 격자 범위 안에 존재하며, 해당 좌표의 값이 1일 때 cnt 증가
                    if (inRange(nx, ny, n) && arr[nx][ny] == 1) {
                        cnt_one ++;
                        //System.out.println("통과, cnt_one = " + cnt_one);
                    }else{
                        //System.out.println("불가, cnt_one = " + cnt_one);
                    }
                }
                //System.out.println("------------------------------");
                //cnt 가 3이상이라면, 문제에서 원하는 조건의 갯수이므로 result를 1 증가
                if (cnt_one >= 3) {
                    result ++;
                }
            }
        }

        //System.out.println("result = " + result);
        System.out.println(result);


    }
}