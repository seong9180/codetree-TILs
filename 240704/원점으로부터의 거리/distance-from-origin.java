//package study.codetree.mid.sort.instance;

//점 클래스의 구성 요소,
//1. 좌표 (x, y)
//2. 거리 (맨하턴 거리)

import java.util.Scanner;
import java.util.Arrays;

class Dot implements Comparable<Dot> {
    int dotX, dotY;
    int number;
    int distance;

    public Dot(int dotA, int dotB, int number, int distance) {
        this.dotX = dotA;
        this.dotY = dotB;
        this.number = number;
        this.distance = distance;
    }

    @Override
    public int compareTo(Dot dot) {
        if (this.distance == dot.distance) { //두 점과 원점과의 거리가 동일하다면
            return this.number - dot.number; //더 낮은 번호가 우선
        }
        return this.distance - dot.distance; //원점과 가까운 점부터
    }
}

/*
2차 평면 위에 N개의 점이 주어졌을 때, 원점에서 가까운 점부터 순서대로 번호를 출력하는 프로그램을 작성해보세요. 거리가 같은 점이 여러 개인 경우, 번호가 작은 점 부터 출력합니다.

단, 여기서의 거리란 멘하턴 거리를 의미합니다. 두 점 (x1, y1), (x2, y2) 사이의 멘하턴 거리는 |x1 - x2| + |y1 - y2|로 정의됩니다.

입력 형식
첫 번째 줄에는 점의 수를 나타내는 N이 주어집니다.

두 번째 줄부터는 N개의 줄에 걸쳐 1번째 점 부터, N번째 점 까지의 위치 (x, y)가 각각 공백을 사이에 두고 주어집니다. (-1,000 ≤ x, y ≤ 1,000)

서로 다른 두 점이 같은 위치에 놓여있는 경우는 없다고 가정해도 좋습니다.

1 ≤ N ≤ 1,000
출력 형식
N개의 줄에 걸쳐 원점에서 가까운 점 부터 순서대로 한 줄에 하나씩 각 점의 번호를 출력합니다. 거리가 같은 점이 여러 개인 경우, 번호가 작은 점부터 먼저 출력합니다.
 */
public class Main {
    public static int distance(int a, int b){
        //멘하턴 거리를 의미합니다. 두 점 (x1, y1), (x2, y2) 사이의 멘하턴 거리는 |x1 - x2| + |y1 - y2|로 정의됩니다.
        int distance = Math.abs(a - 0) + Math.abs(b - 0); //원점과의 멘하턴 거리 계산식
        return distance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Dot[] dots = new Dot[n];
        for (int i = 0; i < n; i++) {
            int dotX = sc.nextInt();
            int dotY = sc.nextInt();
            int number = i + 1;
            int distance = distance(dotX, dotY);

            dots[i] = new Dot(dotX, dotY, number, distance);
        }

        Arrays.sort(dots);
        for (int i = 0; i < n; i++) {
            System.out.println(dots[i].number);
        }

    }
}