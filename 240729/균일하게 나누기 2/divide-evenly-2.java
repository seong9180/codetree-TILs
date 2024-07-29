import java.io.*;
import java.util.*;

public class Main {
    static class Point implements Comparable<Point> {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        
        @Override
        public int compareTo(Point other) {
            return this.x - other.x;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Point[] points = new Point[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points[i] = new Point(x, y);
        }
        
        Arrays.sort(points);
        
        int result = N;
        for (int i = 0; i < N; i++) {
            List<Integer> yCoords = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                if (points[j].x > points[i].x) {
                    yCoords.add(points[j].y);
                }
            }
            Collections.sort(yCoords);
            
            int leftCount = i + 1;
            int rightCount = N - leftCount;
            
            for (int j = 0; j < yCoords.size(); j++) {
                int upperRight = rightCount - j - 1;
                int lowerRight = j + 1;
                
                int upperLeft = 0;
                int lowerLeft = leftCount;
                
                for (int k = 0; k < i + 1; k++) {
                    if (points[k].y > yCoords.get(j)) {
                        upperLeft++;
                        lowerLeft--;
                    }
                }
                
                int maxCount = Math.max(Math.max(upperLeft, upperRight), Math.max(lowerLeft, lowerRight));
                result = Math.min(result, maxCount);
            }
        }
        
        System.out.println(result);
    }
}