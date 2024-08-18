import java.util.*;

public class Main {
    static int n, m;
    static int[] points;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        points = new int[n];

        for (int i = 0; i < n; i++) {
            points[i] = sc.nextInt();
        }

        Arrays.sort(points);

        int left = 0;
        int right = points[n-1] - points[0];
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canPlace(mid)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(result);
    }

    static boolean canPlace(int distance) {
        int count = 1;
        int lastPlaced = points[0];

        for (int i = 1; i < n; i++) {
            if (points[i] - lastPlaced >= distance) {
                count++;
                lastPlaced = points[i];
                if (count >= m) {
                    return true;
                }
            }
        }

        return false;
    }
}