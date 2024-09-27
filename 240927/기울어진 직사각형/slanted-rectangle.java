import java.io.*;
import java.util.*;

public class Main {
    public static int[][] arr;
    public static int[] dx = {1, -1, -1, 1};
    public static int[] dy = {-1, -1, 1, 1};
    public static boolean[][] visited;
    public static int ans = 0;
    public static int n = 0;
    
    public static void check(int a, int b, int sx, int sy) {
        int ss = 0;
        int ax = sx;
        int ay = sy;
        for (int i=1; i<=a; i++){
            int rx = sx + i*dx[0];
            int ry = sy + i*dy[0];
            if (rx < 0 || ry < 0 || rx >= n || ry >=n) return;
            ss += arr[ry][rx];
            ax = rx;
            ay = ry;
        }
        sx = ax;
        sy = ay;
        for(int j=1; j<=b; j++) {
            int rx = sx + j*dx[1];
            int ry = sy + j*dy[1];
            if (rx < 0 || ry < 0 || rx >= n || ry >=n) return;
            ss += arr[ry][rx];
            ax = rx;
            ay = ry;
        }
        sx = ax;
        sy = ay;
        for (int i=1; i<=a; i++) {
            int rx = sx + i*dx[2];
            int ry = sy + i*dy[2];
            if (rx < 0 || ry < 0 || rx >= n || ry >=n) return;
            ss += arr[ry][rx];
            ax = rx;
            ay = ry;
        }
        sx = ax;
        sy = ay;
        for(int j=1; j<=b; j++) {
            int rx = sx + j*dx[3];
            int ry = sy + j*dy[3];
            if (rx < 0 || ry < 0 || rx >= n || ry >=n) return;
            ss += arr[ry][rx];
            ax = rx;
            ay = ry;
        }
        ans = Math.max(ans, ss);
    }
    public static void func(int sx, int sy) {
        int maxx = 1;
        int maxy = 1;
            while(true){
                int rx = sx + maxx*dx[0];
                int ry = sy + maxx*dy[0];
                if (rx < 0 || ry < 0 || rx >= n|| ry >=n){
                    break;
                }
                maxx++;
            }
            while(true){
                int rx = sx + maxy*dx[1];
                int ry = sy + maxy*dy[1];
                if (rx < 0 || ry < 0 || rx >= n || ry >= n) break;
                maxy++;
            }

            for (int i=1; i<= maxx; i++) {
                for (int j=1; j<= maxy; j++) {
                    check(i, j, sx, sy);
                }
            }
        
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n][n];
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                func( j ,i);
            }
        }
        System.out.println(ans);

    }
}