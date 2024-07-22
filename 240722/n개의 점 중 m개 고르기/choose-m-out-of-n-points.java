import java.util.*;

public class Main {
    static int n, m;
    static int[][] points;
    static int minMaxDist = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        
        points = new int[n][2];
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
        
        combination(new int[m], 0, 0);
        
        System.out.println(minMaxDist);
    }
    
    static void combination(int[] selected, int index, int start) {
        if (index == m) {
            updateMinMaxDist(selected);
            return;
        }
        
        for (int i = start; i < n; i++) {
            selected[index] = i;
            combination(selected, index + 1, i + 1);
        }
    }
    
    static void updateMinMaxDist(int[] selected) {
        int maxDist = 0;
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                int dist = calculateDistanceSquared(points[selected[i]], points[selected[j]]);
                maxDist = Math.max(maxDist, dist);
            }
        }
        minMaxDist = Math.min(minMaxDist, maxDist);
    }
    
    static int calculateDistanceSquared(int[] p1, int[] p2) {
        int dx = p1[0] - p2[0];
        int dy = p1[1] - p2[1];
        return dx * dx + dy * dy;
    }
}