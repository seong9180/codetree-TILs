//package study.codetree.mid.dxdy;

import java.util.Scanner;

public class Main {
    //문제에서 주어진 단어가 상하좌우여도, 조건에 따라 각도 변환 하려면 360도 순서대로 배치해야 함. 북 > 동 > 남 > 서 순(초기값 안 중요)
    static int[] dx = {0, 1, 0, -1}; //상우하좌 URDL
    static int[] dy = {1, 0, -1, 0};



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int dir;
        char[] d = new char[n];
        int[] move_count = new int[n];

        int x = 0;
        int y = 0;
        int sum = 0;
        boolean answer = false;

        for (int i = 0; i < n; i++) {
            d[i] = sc.next().charAt(0);
            move_count[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if(d[i] == 'N'){
                dir = 0;
            } else if (d[i] == 'E') {
                dir = 1;
            } else if (d[i] == 'S') {
                dir = 2;
            } else {
                dir = 3;
            }

            for (int j = 0; j < move_count[i]; j++) {
                x += dx[dir];
                y += dy[dir];
                sum ++;
                if (x == 0 && y == 0) {
                    System.out.println(sum);
                    answer = true;
                    break;
                }
            }
            if (answer) {
                break;
            }
        }

        if(!answer){
            System.out.println("-1");
        }
    }
}