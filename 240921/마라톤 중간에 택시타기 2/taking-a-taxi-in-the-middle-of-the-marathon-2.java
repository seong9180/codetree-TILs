//package NoviceMid.ExhaustiveSearch;

import java.util.Scanner;

public class Main {
    public static int calcDistance(int x1, int x2, int y1, int y2) {
        int distance = 0;
        distance = Math.abs(x1 - x2) + Math.abs(y1 - y2);
        return distance;
    }
    //마라톤 코스 체크포인트 : n 개
    //1번 체크포인트에서 시작 > 모든 체크포인트 순서대로 방문, n 번 체크포인트에서 마라톤 종료
    //
    //게으른 개발자 a, 체크포인트 1 개를 몰래 건너 뛸 예정.
    //(1번, n 번은 제외)
    //
    //최소 거리를 구해야 함.
    //동일한 좌표에 여러개의 체크 포인트가 주어질 경우.
    //> 개발자가 해당 체크포인트를 건너뛴다고 해서 나머지 모든 동일한 좌표도 건너뛰는 것은 아님.
    //
    //첫 번째 줄 : 체크포인트 n 갯수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 체크포인트 갯수
        int[] arrX = new int[n];
        int[] arrY = new int[n];

        for (int i = 0; i < n; i++) {
            arrX[i] = sc.nextInt();
            arrY[i] = sc.nextInt();
        }

        int distance = 0;
        for (int i = 0; i < n - 1; i++) {
            distance += calcDistance(arrX[i], arrX[i+1], arrY[i], arrY[i+1]);
        }

        int minDistance = distance;
        for (int i = 1; i < n - 2; i++) {
            int skipDistance = distance
                    - calcDistance(arrX[i - 1], arrX[i], arrY[i - 1], arrY[i])
                    - calcDistance(arrX[i], arrX[i + 1], arrY[i], arrY[i + 1])
                    + calcDistance(arrX[i - 1], arrX[i + 1], arrY[i - 1], arrY[i + 1]);
            minDistance = Math.min(minDistance, skipDistance);
        }

        System.out.println(minDistance);

    }
}