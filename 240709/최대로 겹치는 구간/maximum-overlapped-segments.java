//package study.codetree.mid.simulation;

import java.util.Scanner;

class LineSegment { //선분을 저장해 둘 선분 클래스 지정
    int x, y;

    public LineSegment() {
        this.x = 0;
        this.y = 0;
    }

    public LineSegment(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static int[] maxArea = new int[202]; // offset 반영 최대 크기 200 번위 설정

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //선분 갯수
        LineSegment[] segments = new LineSegment[n]; //선분들 저장하는 리스트
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            //x,y 의 범위가 -100 ~ +100 이라서 전체적으로 + 101 offset 설정
            //배열 0~200++ 범위에 넣기 위해 + 101로 수정.
            segments[i] = new LineSegment(x + 101, y + 101);
        }

        for (int i = 0; i < n; i++) {
            for (int j = segments[i].x - 1 ; j < segments[i].y - 1; j++) { //구간 카운트는 x1 ~ x2 -1
                maxArea[j] ++;
            }
        }

        int max = 0;
        for (int i = 0; i < 202; i++) {
            if (maxArea[i] >= max) {
                max = maxArea[i];
            }
        }

        System.out.println(max);

    }
}