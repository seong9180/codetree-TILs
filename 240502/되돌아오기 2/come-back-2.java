//package codetree;

import java.util.Scanner;

public class Main {
    static int[] dx = {0,1,0,-1}; //북동남서
    static int[] dy = {1,0,-1,0};
    static boolean answer = false;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();
        char[] single = new char[command.length()];
        for (int i = 0; i < command.length(); i++) {
            single[i] = command.charAt(i);
        }

        int dir = 0; //북쪽
        int count = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < command.length(); i++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (single[i] == 'L') {
                dir = (dir + 3) % 4; //반대방향 90도
                count ++;
                continue;
            } else if (single[i] == 'R') {
                dir = (dir + 1) % 4; //정방향 90도
                count ++;
                continue;
            }

            x += dx[dir];
            y += dy[dir];
            count ++;

            if (x == 0 && y == 0) {
                answer = true;
                System.out.println(count);
                break;
            }
        }

        if (answer == false) {
            System.out.println("-1");
        }


    }
}