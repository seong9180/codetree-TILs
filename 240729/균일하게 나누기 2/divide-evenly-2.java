import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[][] points = new int[N][2];
        Set<Integer> xSet = new HashSet<>();
        Set<Integer> ySet = new HashSet<>();
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points[i] = new int[]{x, y};
            xSet.add(x);
            ySet.add(y);
        }
        
        List<Integer> xList = new ArrayList<>(xSet);
        List<Integer> yList = new ArrayList<>(ySet);
        Collections.sort(xList);
        Collections.sort(yList);
        
        int result = N;
        
        for (int i = 0; i < xList.size(); i++) {
            for (int j = 0; j < yList.size(); j++) {
                int a = (xList.get(i) + 1) / 2 * 2;
                int b = (yList.get(j) + 1) / 2 * 2;
                
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