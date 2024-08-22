//package NoviceMid.Simulation1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] area = new int[2000][2000];

        int ax1 = sc.nextInt() + 1000;
        int ay1 = sc.nextInt() + 1000;
        int ax2 = sc.nextInt() + 1000;
        int ay2 = sc.nextInt() + 1000;

        for (int i = ax1; i < ax2; i++) {
            for (int j = ay1; j < ay2; j++) {
                area[i][j] = 1;
            }
        }
        int bx1 = sc.nextInt() + 1000;
        int by1 = sc.nextInt() + 1000;
        int bx2 = sc.nextInt() + 1000;
        int by2 = sc.nextInt() + 1000;

        int aCount = 0; //a 사각형의 원래 크기를 저장해둔 변수
        for (int i = 0; i < 2000; i++) {
            for (int j = 0; j < 2000; j++) {
                if (area[i][j] == 1) {
                    aCount ++;
                }
            }
        }

        for (int i = bx1; i < bx2; i++) { //B 도형 등장
            for (int j = by1; j < by2; j++) {
                area[i][j] = 2; //b 사각형을 2로 채움. (a 사각형에서 b 사각형과 겹치는 부분도 2)
            }
        }

        int aAfterB = 0; //b 사각형이 겹쳐지고 난 뒤 남은 a 도형의 크기 저장
        for (int i = 0; i < 2000; i++) {
            for (int j = 0; j < 2000; j++) {
                if (area[i][j] == 1) {
                    aAfterB ++;
                }
            }
        }

        /*
        IDEA : 도형 a의 4 꼭짓점을 비교했을 떄,
        1. 1이 3번 나오면 : ㄴ 혹은 ㄱ 등 한 변의 일부가 겹친 도형 모양 >> 원래 a 크기 : 잔해물의 넓이
        2. 1이 2번 나오면 : 한쪽 변이 통째로 b 안에 포함되는 모양 >> 전체 배열에서 2로 변한 부분을 제외한 1의 갯수 : 잔해물의 넓이
        3. 모든 꼭짓점이 2라면 : a 도형이 b 도형 안에 완전히 포함된 모양 >> 잔해물의 넓이 0 (잔해물이 없음)
        --------------------------------------------------------------------------------------------------
        4꼭짓점의 좌표
        (x1, y1), (x1, y2-1), (x2-1, y1), (x2-1,y2-1)
        > 이차원 배열로 변환하면서 실제로 값이 들어가는 범위는 x1 ~ x2-1 , y1 ~ y2-1 까지기 때문.
         */

        //a 사각형의 4꼭짓점 변수 선언
        int[] corner = new int[4];
        corner[0] = area[ax1][ay1];
        corner[1] = area[ax1][ay2 - 1];
        corner[2] = area[ax2 - 1][ay1];
        corner[3] = area[ax2 - 1][ay2 - 1];

        int cornerCount = 0;
        int answer = 0;

        for (int i = 0; i < 4; i++) {
            if (corner[i] == 1) {
                cornerCount++; //여전히 a 도형인 경우
            }
        }

        if (cornerCount == 2) { //한쪽 변이 통째로 b 안에 포함되는 모양 >> 전체 배열에서 2로 변한 부분을 제외한 1의 갯수 : 잔해물의 넓이
            answer = aAfterB; //b 도형이 그려지고 난 a
        } else if (cornerCount == 3) { //ㄴ 혹은 ㄱ 등 한 변의 일부가 겹친 도형 모양 >> 원래 a 크기 : 잔해물의 넓이
            answer = aCount; //b 도형이 그려지기 전 a
        } else if (cornerCount == 4) { // a 와 b 가 아예 겹치지 않는 경우
            answer = aCount; //b 도형이 그려지기 전 a
        } else if (cornerCount == 0) { // a 도형이 b 도형 안에 완전히 포함된 경우
            answer = 0;
        } else {
            System.out.print("error! cornercount : ");
            answer = cornerCount;
        }

        System.out.println(answer);

    }
}