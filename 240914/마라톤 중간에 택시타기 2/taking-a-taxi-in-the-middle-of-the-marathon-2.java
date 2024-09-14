import java.util.Scanner;

public class Main {
    public static int calcDistance(int x1, int x2, int y1, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 체크포인트 갯수
        int[] arrX = new int[n];
        int[] arrY = new int[n];

        for (int i = 0; i < n; i++) {
            arrX[i] = sc.nextInt();
            arrY[i] = sc.nextInt();
        }

        int totalDistance = 0;
        for (int i = 0; i < n - 1; i++) {
            totalDistance += calcDistance(arrX[i], arrX[i+1], arrY[i], arrY[i+1]);
        }

        int minDistance = totalDistance;
        for (int i = 1; i < n - 1; i++) {
            int newDistance = totalDistance
                            - calcDistance(arrX[i-1], arrX[i], arrY[i-1], arrY[i])
                            - calcDistance(arrX[i], arrX[i+1], arrY[i], arrY[i+1])
                            + calcDistance(arrX[i-1], arrX[i+1], arrY[i-1], arrY[i+1]);
            minDistance = Math.min(minDistance, newDistance);
        }

        System.out.println(minDistance);

        sc.close();
    }
}