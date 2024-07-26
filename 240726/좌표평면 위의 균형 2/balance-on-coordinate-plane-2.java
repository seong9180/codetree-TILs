import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points.add(new Point(x, y));
        }

        int result = N; // 초기값을 N으로 설정 (최악의 경우)

        for (int x = 2; x <= 100; x += 2) {
            for (int y = 2; y <= 100; y += 2) {
                int[] quadrants = new int[4];
                
                for (Point p : points) {
                    if (p.x < x && p.y > y) quadrants[0]++;
                    else if (p.x > x && p.y > y) quadrants[1]++;
                    else if (p.x < x && p.y < y) quadrants[2]++;
                    else if (p.x > x && p.y < y) quadrants[3]++;
                }
                
                int maxPoints = Math.max(Math.max(quadrants[0], quadrants[1]), 
                                         Math.max(quadrants[2], quadrants[3]));
                result = Math.min(result, maxPoints);
            }
        }

        System.out.println(result);
    }

    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}