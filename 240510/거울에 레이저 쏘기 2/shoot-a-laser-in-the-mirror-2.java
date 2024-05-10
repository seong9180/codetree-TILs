//package study.codetree.mid.dxdy;

import java.util.Scanner;

public class Main {
    static int[] dx = {1,0,-1,0}; //남서북동 (벡터 방향 기준으로)
    static int[] dy = {0,-1,0,1};
    static boolean out_of_gird = false;
    static boolean inRange(int x, int y, int n) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] mirror = new char[n + 2][n + 2];
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < n; j++) {
                //System.out.println("sc = " + sc.next());
                mirror[i][j] = str.charAt(j);
                //System.out.println("sc = " + sc.next());
                //System.out.println("mirror" + "[" + i + "][" + j + "] = " + mirror[i][j]);
            }
        }
        int dir = 0;
        int start = sc.nextInt();
        /*
        [시작 레이저 방향]
        1 ~ N : 북쪽에서 시작. (방향성은 남쪽)
        N+1 ~ 2N : 동쪽
        2N+1 ~ 3N : 남쪽
        3N+1 ~ 4N : 서쪽
        */
        if (0 < start && start <= n) { //남
            dir = 0;
        } else if (n < start && start <= 2 * n) { //서
            dir = 1;
        } else if (2 * n < start && start <= 3 * n) { //북
            dir = 2;
        } else if (3 * n < start && start <= 4 * n) { //동
            dir = 3;
        }
        //System.out.println("dir = " + dir);
        //int start_line = start % 4;
        int count = 0;
        int x = 0;
        int y = 0;
        if (dir == 0) { //남향
            x = 0;
            y = start - 1;
        } else if (dir == 1) { //서향
            y = n - 1;
            x = start - n - 1;
        } else if (dir == 2) { //북향
            x = n - 1;
            y = n - (start - (n * 2) - 1) - 1;
        } else if (dir == 3) { //동향
            y = 0;
            x = n - (start - (n * 3) - 1) - 1;
        }
        while (!out_of_gird) {
            //System.out.println("루프 첫 dir = " + dir);
                /*
                [거울 모양 별 각도 변화]
                / 모양일 때,
                > 북쪽에서 레이저를 쏘면 (벡터 방향 남쪽) 오른쪽으로 90도 이동
                > 동쪽에서 레이저를 쏘면 (벡터 방향 서쪽) 왼쪽으로 90도 이동
                > 남쪽에서 레이저를 쏘면 (벡터 방향 북쪽) 오른쪽으로 90도 이동
                > 서쪽에서 레이저를 쏘면 (벡터 방향 동쪽) 왼쪽으로 90도 이동
                \ 모양일 때,
                > 북쪽에서 레이저를 쏘면 (벡터 방향 남쪽) 왼쪽으로 90도 이동
                > 동쪽에서 레이저를 쏘면 (벡터 방향 서쪽) 오른쪽으로 90도 이동
                > 남쪽에서 레이저를 쏘면 (벡터 방향 북쪽) 왼쪽으로 90도 이동
                > 서쪽에서 레이저를 쏘면 (벡터 방향 동쪽) 오른쪽으로 90도 이동
                 */
            if (mirror[x][y] == '/' && dir == 0) { //남 : 오른쪽으로 90도 이동
                dir = (dir + 1) % 4;
            }else if( mirror[x][y] == '\\' && dir == 0){ //오른쪽으로 90도 이동
                dir = (dir + 3) % 4;
            }else if( mirror[x][y] == '/' && dir == 1){ //서쪽
                dir = (dir + 3) % 4;
            }else if( mirror[x][y] == '\\' && dir == 1){
                dir = (dir + 1) % 4;
            }else if( mirror[x][y] == '/' && dir == 2){ //북쪽
                dir = (dir + 1) % 4;
            }else if( mirror[x][y] == '\\' && dir == 2){
                dir = (dir + 3) % 4;
            }else if( mirror[x][y] == '/' && dir == 3){ //동쪽
                dir = (dir + 3) % 4;
            }else if( mirror[x][y] == '\\' && dir == 3){
                dir = (dir + 1) % 4;
            }
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            //System.out.println("if-else 이후 변경된 dir");
            //System.out.println("dir = " + dir);
            //System.out.println("x = " + x);
            //System.out.println("nx = " + nx);
            //System.out.println("y = " + y);
            //System.out.println("ny = " + ny);
            if (!inRange(nx, ny, n)) { //격자 밖을 탈출한다면 - 거울에 튕기는 횟수 출력
                //System.out.println("inRange false!");
                out_of_gird = true;
                count ++; //범위 밖으로 갈 때도 카운트는 증가되고 있기 때문
                System.out.println(count);
                break;
            }

            x += dx[dir];
            y += dy[dir];
            count ++;
            //System.out.println("count = " + count);
        }
    }
}