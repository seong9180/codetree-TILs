import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[][] points = new int[N][2];
        int[] xCoords = new int[N];
        int[] yCoords = new int[N];
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points[i] = new int[]{x, y};
            xCoords[i] = x;
            yCoords[i] = y;
        }
        
        Arrays.sort(xCoords);
        Arrays.sort(yCoords);
        
        int result = N;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int a = xCoords[i] + 1;
                int b = yCoords[j] + 1;
                
                int q1 = 0, q2 = 0, q3 = 0, q4 = 0;
                
                for (int[] point : points) {
                    if (point[0] < a && point[1] > b) q1++;
                    else if (point[0] > a && point[1] > b) q2++;
                    else if (point[0] < a && point[1] < b) q3++;
                    else if (point[0] > a && point[1] < b) q4++;
                }
                
                int maxPoints = Math.max(Math.max(q1, q2), Math.max(q3, q4));
                result = Math.min(result, maxPoints);
            }
        }
        
        System.out.println(result);
    }
}